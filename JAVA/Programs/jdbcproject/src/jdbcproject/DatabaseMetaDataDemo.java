package jdbcproject;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseMetaDataDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/wiprodbs";
		String username = "root";
		String password="your_password";
		
		//1. Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// com.oracle.driver.OracleDriver
		
		// 2. Create the Connection
		Connection con = DriverManager.getConnection(url, username, password);
		
		// Get DatabaseMetaData object
		DatabaseMetaData dbmd = con.getMetaData();
		
		// Database Information
		System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
		System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());
		System.out.println("Driver Name: " + dbmd.getDriverName());
		System.out.println("Driver Version: " + dbmd.getDriverVersion());
		
		//List all tables in the database
		String[] types = {"TABLE"};
		var rs = dbmd.getTables(null, null, "%", types);
		System.out.println("Tables in the database:");
		while (rs.next()) {
			System.out.println(rs.getString("TABLE_NAME"));
		}
		
		System.out.println("Table Column Deails");
		// Get columns details for a specific table
		rs = dbmd.getColumns(null, null, "employees", null);
		while (rs.next()) {
			System.out.println("Column Name: " + rs.getString("COLUMN_NAME") + ", Data Type: "
					+ rs.getString("TYPE_NAME") + ", Column Size: " + rs.getInt("COLUMN_SIZE"));
		}
		
		
		// Printing Primary key
		System.out.println("Primary Key Details:");
		rs = dbmd.getPrimaryKeys(null, null, "employees");
		while (rs.next()) {
			System.out.println("Column Name: " + rs.getString("COLUMN_NAME") + ", Key Sequence: "
					+ rs.getShort("KEY_SEQ") + ", PK Name: " + rs.getString("PK_NAME"));
		}
		
		// 6. Close the connections
		con.close();
		
		
		

	}

}
