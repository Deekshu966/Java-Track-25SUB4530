package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// 1. Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodbs", "root", "your_password");

		// 2. Create the Statement
		Statement st = com.createStatement();

		String sql = "update employees set department='Finance' where id=9";

		// 3. Execute the Query
		int k = st.executeUpdate(sql);
		if (k > 0)
			System.out.println("Record updted Successfully");
		else
			System.out.println("Update Failed");

		// 4. Close the connections
		st.close();
		com.close();

	}

}
