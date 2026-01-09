package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/wiprodbs";
		String username = "root";
		String password="your_password";
		
		//1. Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		// 2. Create the Connection
		Connection con = DriverManager.getConnection(url, username, password);

		// 3. Create the Statement
		Statement st = con.createStatement();
		
		// 4. Execute the Query
		String sql = "SELECT * FROM employees";
		ResultSet rs = st.executeQuery(sql);
		
		// 5. Process the ResultSet
		while(rs.next())
		System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("department"));
		
		
		// 6. Close the connections
		rs.close();
		st.close();
		con.close();
		
	
	}

}
