package jdbcproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("d://jdbc/db.properties");
		props.load(fis);
		String url =props.getProperty("db.url");
		String username = props.getProperty("db.username");
		String password=props.getProperty("db.password");
		String driver = props.getProperty("db.driver");
		
		//1. Load the Driver
		Class.forName(driver);
		// com.oracle.driver.OracleDriver
		
		// 2. Create the Connection
		Connection con = DriverManager.getConnection(url, username, password);

		// 3. Create the Statement
		Statement st = con.createStatement();
		
		// 4. Execute the Query
		String sql = "SELECT * FROM employees";
		ResultSet rs = st.executeQuery(sql);
		
		// 5. Process the ResultSet
		while(rs.next())
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		
		
		// 6. Close the connections
		rs.close();
		st.close();
		con.close();
		
	
	}

}
