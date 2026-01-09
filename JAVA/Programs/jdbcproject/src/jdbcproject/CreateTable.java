package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		System.out.println("CreateTable Java File");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodbs","root","your_password");
		Statement st = con.createStatement();
		String sql = "CREATE TABLE emp " + "(id INTEGER not NULL, " + " name VARCHAR(255), "
				+ " department VARCHAR(255), " + " PRIMARY KEY ( id ))";
		
		st.execute(sql);
		System.out.println("Table Created Successfully");
		st.close();
		con.close();
		

	}

}
