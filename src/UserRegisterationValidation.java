import java.util.Scanner;
public class UserRegisterationValidation {
	
	
	public static void main(String args[]) {
		
		
		
		lastName();
	}
	static String lastName() {
		RegexValidation jr = new RegexValidation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Last Name");
		String LastName = sc.nextLine();
		boolean r = jr.validate(LastName);
		if(r) {
			System.out.println("Name is valid");
			return LastName;
			
		}
		else {
			System.out.println("Name is not valid , Enter correct Name");
			return lastName();
		}
	}

}