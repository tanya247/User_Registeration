import java.util.Scanner;
public class UserRegisterationValidation {
	
	
	public static void main(String args[]) {
		
		
		
		firstName();
	}
	static String firstName() {
		RegexValidation jr = new RegexValidation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		String FirstName = sc.nextLine();
		boolean r = jr.validate(FirstName);
		if(r) {
			System.out.println("Name is valid");
			return FirstName;
			
		}
		else {
			System.out.println("Name is not valid , Enter correct Name");
			return firstName();
		}
	}

}