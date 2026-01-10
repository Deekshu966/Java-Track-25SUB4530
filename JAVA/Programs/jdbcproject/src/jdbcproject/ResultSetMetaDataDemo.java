package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetMetaDataDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/wiprodb";
		String username = "root";
		String password="your_password";
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Table Name:");
		String tableName = sc.next();
		//1. Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// com.oracle.driver.OracleDriver
		
		// 2. Create the Connection
		Connection con = DriverManager.getConnection(url, username, password);
		
		String sql = "SELECT * FROM  " + tableName;
		
		Statement st = con.createStatement();
		
		// 3. Execute the Query
		ResultSet rs = st.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
		while (rs.next()) {
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(rs.getString(i) + " ");
			}
			System.out.println();
		}
		
		// close the connections
		
		rs.close();
		st.close();

	}

}
