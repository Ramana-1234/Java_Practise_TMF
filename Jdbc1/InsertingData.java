package Jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertingData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.
				getConnection("jdbc:mysql://localhost:3306/Jdbcdatabase","root","ramana123");
		String query ="insert into Student values(?,?)";
		PreparedStatement ps= con.prepareStatement(query);
		ps.setInt(1, 2);
		ps.setString(2," Venkat");
		int rowsAffected = ps.executeUpdate();
		if (rowsAffected>0) {
		System.out.println("insertion successful");	
		}
		else {
			System.out.println("insertion failed");
		}

	}

}
