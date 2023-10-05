package restAssured;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {

	
	public static String getEmail() {
		String generatedString = RandomStringUtils.randomAlphanumeric(3);
		return ("john"+generatedString+"@gmail.com");
	}
	
	public static String getPassword() {
		String generatedString = RandomStringUtils.randomAlphanumeric(8);
		return (generatedString);
	}
}
