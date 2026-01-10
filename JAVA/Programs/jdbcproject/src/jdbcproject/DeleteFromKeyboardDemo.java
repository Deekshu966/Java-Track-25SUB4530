package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteFromKeyboardDemo {

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
		
		String query = "delete from employees where id=?";
		PreparedStatement pst = con.prepareStatement(query);
		
		
		System.out.println("Enter Employee ID:");
		int id = sc.nextInt();
		
		pst.setInt(1,id);
		
		int k = pst.executeUpdate();
		
		if( k>0)
			System.out.println("Record(s) deleted Successfully");
		else
			System.out.println("Deletion Failed");

		// 6. Close the connections
		pst.close();
		con.close();
		sc.close();
		
		

	}

}
