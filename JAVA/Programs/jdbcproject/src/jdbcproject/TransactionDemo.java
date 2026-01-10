package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement st = null;
		try {
			// 1. Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodbs", "root", "your_password");
			con.setAutoCommit(false); // Start transaction
			// 2. Create the Statement
			st = con.createStatement();

			String sql = "INSERT INTO employees VALUES (30, 'John Doe', 'HR')";
			String str = "Hai";
			int k = st.executeUpdate(sql);
			System.out.println(str.charAt(1)); // This will throw StringIndexOutOfBoundsException
			
			if (k > 0) {
				System.out.println("Record Inserted Successfully");
			} else {
				System.out.println("Insertion Failed");
			}
			con.commit(); // Commit transaction
			
			
		} catch (Exception e) {
			 // Rollback transaction on error
			System.out.println("Error occurred: " + e.getMessage());
			if (con != null) {
				con.rollback();
				System.out.println("Transaction Rolled Back");
			}
		}
	}

}
