package flightcrudproject.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FlightDbUtils {
	String url = "jdbc:mysql://localhost:3306/wiprodbs";
	String username = "root";
	String password="your_password";
	
	public static Connection getConnection() {
		// Implement database connection logic here
		Connection con=null;
		
		//1. Load the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// com.oracle.driver.OracleDriver
		
		// 2. Create the Connection
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodbs", "root", "your_password");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
