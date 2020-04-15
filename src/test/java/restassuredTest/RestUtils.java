package restassuredTest;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {

    public static String getFirstName() {
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("Can" + generatedString);
    }

    public static String getJob() {
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("Engineer" + generatedString);
    }
}
