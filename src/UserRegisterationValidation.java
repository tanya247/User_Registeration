import java.util.Scanner;
public class UserRegisterationValidation {
	
	
	public static void main(String args[]) {
		firstName();
		lastName();
	}
	static String firstName() {
		RegexValidation jr = new RegexValidation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		String FirstName = sc.nextLine();
		boolean r = jr.validateFirstName(FirstName);
		if(r) {
			System.out.println("Name is valid");
			return FirstName;
			
		}
		else {
			System.out.println("Name is not valid , Enter correct Name");
			return firstName();
		}
	}
	static String lastName() {
		RegexValidation jr = new RegexValidation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Last Name");
		String LastName = sc.nextLine();
		boolean r = jr.validateLastName(LastName);
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