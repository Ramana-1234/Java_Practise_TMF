package Jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletingData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.
				getConnection("jdbc:mysql://localhost:3306/Jdbcdatabase","root","ramana123");
		
		String query= "delete from Student where sid= ?";
		PreparedStatement ps= con.prepareStatement(query);
		ps.setInt(1 ,2 );
		int i =ps.executeUpdate();
		ps.execute();
		if(i>0) {
			System.out.println("deletion successful");
		}
		else {
			System.out.println("deletion not succesful");
		}

	}

}
