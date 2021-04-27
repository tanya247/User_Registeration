import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexValidation {
	String validFirstName = "^[A-Z]{1}[a-z]{2,}";
	boolean validate(String FirstName) {
		Pattern pattern = Pattern.compile(validFirstName);
		Matcher match = pattern.matcher(FirstName);
		boolean b = match.matches();
		return b;
	}

}
