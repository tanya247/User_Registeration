import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexValidation {
	String validLastName = "^[A-Z]{1}[a-z]{2,}";
	boolean validate(String LastName) {
		Pattern pattern = Pattern.compile(validLastName);
		Matcher match = pattern.matcher(LastName);
		boolean b = match.matches();
		return b;
	}

}
