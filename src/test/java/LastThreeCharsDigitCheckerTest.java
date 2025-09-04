import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastThreeCharsDigitCheckerTest {

    @DataProvider(name = "testData")
    public Object[][] provideTestData() {
        return new Object[][]{
                {"Test8RE", true},    // Digit in the last 3 characters
                {"HelloXYZ", false},  // No digit in the last 3 characters
                {"99", true},         // Digit in the last 3 characters
                {"Hi123", true},      // Digit in the last 3 characters
                {"H", false},         // String length less than 3, no digit
                {"", false},          // Empty string
                {null, false},        // Null string
                {"AB1", true},        // Digit in the last 3 characters
                {"AB", false},        // String length less than 3, no digit
                {"-1", true},         // Digit in the last 3 characters
                {"1__&#", false}      // No digit in the last 3 characters
        };
    }

    @Test(dataProvider = "testData")
    public void testHasNumberInLastThreeChars(String input, boolean expected) {
        boolean result = LastThreeCharsDigitChecker.hasNumberInLastThreeChars(input);
        Assert.assertEquals(result, expected, "Test failed for input: " + input);
    }
}