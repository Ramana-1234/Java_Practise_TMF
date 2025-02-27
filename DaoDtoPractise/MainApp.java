package DaoDtoPractise;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO userDAO = new UserDAO();
		
		userDAO.addUser(new UserDTO(1,"ramana","ramana@gmail.com"));
		userDAO.addUser(new UserDTO(2,"venkat","venkat@gmail.com"));
		userDAO.addUser(new UserDTO(3,"varma","varma@gmail.com"));
		
		System.out.println("All users :"+userDAO.getAllUsers());
		System.out.println("user with id 2 :"+userDAO.getUserById(2));
		
		userDAO.updateUser(new UserDTO (3,"nvm varma","varma@gmail.com"));
		System.out.println("Updated user :"+userDAO.getUserById(3));
		
		userDAO.deleteUser(1);
		System.out.println("user 1 deleted successfully");
		

	}

}
