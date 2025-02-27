package Jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExample1 {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.
				getConnection("jdbc:mysql://localhost:3306/Jdbcdatabase","root","ramana123");
		if ( con!=null)
		System.out.println("Connection created");
		else {
			System.out.println("Connection failed");
		}
	}

}
