package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateFromKeyboard {

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
		
		String sql = "update employees set department=? where id=?";
		String query = "select * from employees where id=?";
		PreparedStatement pst  = con.prepareStatement(sql);
		PreparedStatement pst1 = con.prepareStatement(query);
		
		System.out.println("Enter Employee id to update:");
		int id = sc.nextInt();
		
		System.out.println("Enter new Department:");
		String dept = sc.next();
		
		pst.setString(1,dept);
		pst.setInt(2,id);
		
		int k = pst.executeUpdate();
		if (k > 0)
			System.out.println("Record Updated Successfully");
		else
			System.out.println("Updation Failed");
		
		pst1.setInt(1, id);
		ResultSet rs = pst1.executeQuery();
		while (rs.next())
			System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("department"));
		
		
		// 6. Close the connections
		pst.close();
		pst1.close();
		rs.close();
		
		con.close();
		sc.close();

	}

}
