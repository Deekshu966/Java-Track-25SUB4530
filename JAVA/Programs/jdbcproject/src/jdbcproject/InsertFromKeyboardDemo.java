package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertFromKeyboardDemo {

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
		con.setAutoCommit(false);
		String sql = "INSERT INTO employees VALUES (?,?,?)";
		// create a PreapredStatement Object
		PreparedStatement pst = con.prepareStatement(sql);
		
		System.out.println("Enter Employee ID:");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name:");
		String name = sc.next();
		System.out.println("Enter Employee Department:");
		String dept = sc.next();
		
		pst.setInt(1,id);
		pst.setString(2,name);
		pst.setString(3,dept);
		
		int k = pst.executeUpdate();
		if (k > 0)
			System.out.println("Record Inserted Successfully");
		else
			System.out.println("Insertion Failed");
		con.commit();
        // 6. Close the connections
		        pst.close();
		        con.close();

	}

}
