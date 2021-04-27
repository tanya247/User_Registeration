import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexValidation {
	String validFirstName = "^[A-Z]{1}[a-z]{2,}";
	String validLastName = "^[A-Z]{1}[a-z]{2,}";
	String validEmailAddress ="^[a-z0-9][a-z\\.]+@[a-z0-9]+[\\.]+[a-z\\.]";
	boolean validateFirstName(String FirstName) {
		Pattern pattern = Pattern.compile(FirstName);
		Matcher match = pattern.matcher(FirstName);
		boolean b = match.matches();
		return b;
	}
	boolean validateLastName(String LastName) {
		Pattern pattern = Pattern.compile(validLastName);
		Matcher match = pattern.matcher(LastName);
		boolean b = match.matches();
		return b;
	}
	boolean validateEmailAddress(String EmailAddress) {
		Pattern pattern = Pattern.compile(validEmailAddress);
		Matcher match = pattern.matcher(EmailAddress);
		boolean b = match.matches();
		return b;
	}
}
