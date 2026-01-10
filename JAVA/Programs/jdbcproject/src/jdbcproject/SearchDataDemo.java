package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SearchDataDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/wiprodbs";
		String username = "root";
		String password="your_password";
		Scanner sc = new Scanner(System.in);
		//1. Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// com.oracle.driver.OracleDriver
		
		// 2. Create the Connection
		Connection con = DriverManager.getConnection(url, username, password);
		
		String sql = "SELECT * FROM employees WHERE department=?";
		
		// create a PreapredStatement Object
		PreparedStatement pst = con.prepareStatement(sql);
		
		System.out.println("Enter Employee Department:");
		String dept = sc.next();
		
		pst.setString(1,dept);
		
		// 3. Execute the Query
		ResultSet rs = pst.executeQuery();
		while(rs.next())
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("department"));

		// 6. Close the connections
		rs.close();
		pst.close();
		con.close();
		sc.close();
		
		
	}

}
