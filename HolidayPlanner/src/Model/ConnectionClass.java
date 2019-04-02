package Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
	private ConnectionClass() {}
	
	public static Connection getConnection() {

		Connection con = null;
		try {System.out.println("Entering try catch block");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Proceeding for connection");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		} catch (Exception E) {
			System.out.println("Exception : Not getting Connection     "+E);
		}
		return con;

	}
}
