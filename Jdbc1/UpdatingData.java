package Jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatingData {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.
				getConnection("jdbc:mysql://localhost:3306/jdbcdata","root","ramana123");
		
		String query="UPDATE student SET name = ? WHERE sid=?;";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, "venkata ramana"); 
        ps.setInt(2, 2);
		int i =ps.executeUpdate();
		ps.execute();
		if(i>0) {
			System.out.println("Updation successful");
		}
		else {
			System.out.println("Updation not succesful");
		}
		
		ps.close();
		con.close();

	}

}
