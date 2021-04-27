import java.util.Scanner;
public class UserRegisterationValidation {
	static RegexValidation jr = new RegexValidation();
	
	public static void main(String args[]) {
		firstName();
		lastName();
		emailAddress();
		phoneNumber();
		password();
	}
	static String firstName() {
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
	static String emailAddress() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email Address");
		String EmailAddress = sc.nextLine();
		boolean r = jr.validateEmailAddress(EmailAddress);
		if(r) {
			System.out.println("Email Address is valid");
			return EmailAddress;
			
		}
		else {
			System.out.println("Email Address is not valid , Enter correct Email Adress");
			return emailAddress();
		}
	}
	static String phoneNumber() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter phone Number");
		String PhoneNumber = sc.nextLine();
		boolean r = jr.validatePhoneNumber(PhoneNumber);
		if(r) {
			System.out.println("Phone Number is valid");
			return PhoneNumber;
			
		}
		else {
			System.out.println("Phone Number is not valid , Enter correct Phone Number");
			return phoneNumber();
		}
	}
	static String password() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password");
		String Password = sc.nextLine();
		boolean r = jr.validatePassword(Password);
		if(r) {
			System.out.println("Password is valid");
			return Password;
			
		}
		else {
			System.out.println("Password is not valid , Enter correct Password");
			return password();
		}
	}
}
