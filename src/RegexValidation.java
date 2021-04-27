import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexValidation {
	String validFirstName = "^[A-Z]{1}[a-z]{2,}";
	String validLastName = "^[A-Z]{1}[a-z]{2,}";
	boolean validateFirstName(String FirstName) {
		Pattern pattern = Pattern.compile(validFirstName);
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
}