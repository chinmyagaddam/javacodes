import java.util.*;

public class HardCodedLogin {
	
	private static final String USERNAME="admin";
	private static final String PASSWORD="password";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String username=sc.nextLine();
		System.out.println("enter password");
		String password=sc.nextLine();
		if(authenticate(username,password)) {
			System.out.println("Login Successfull.");
		}
		else {
			System.out.println("Invalid username or password, Login Failed.");
		}

	}
	private static boolean authenticate(String username,String password) {
		return USERNAME.equals(username) && PASSWORD.equals(password);
	}

}
