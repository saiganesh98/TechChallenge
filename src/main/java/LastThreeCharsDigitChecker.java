/**
 * Challenge
 * Program to check if the last three characters of a given string
 * contain a number
 * Example:
 * Input: "Test8RE"
 * Output: true (because '8' is within the last 3 characters "8RE")
 */
public class LastThreeCharsDigitChecker {

    /**
     * Checks if the last 3 characters of a string contain a digit.
     *
     * @param input The input string to check
     * @return true if at least one digit is found in the last 3 characters, false otherwise
     */
    public static boolean hasNumberInLastThreeChars(String input) {
        if (input == null || input.isEmpty()) {
            return false; // handle null or empty input safely
        }
        String lastThree = input.substring(Math.max(0, input.length() - 3));

        // Check if it contains the digit
        return lastThree.chars().anyMatch(Character::isDigit);
    }

    // Main Method to test the function
    public static void main(String[] args) {
        String[] testInputs = {
                "Test8RE",    // Expected: true
                "HelloXYZ",   // Expected: false
                "99",         // Expected: true
                "Hi123",      // Expected: true
                "H",          // Expected: false
                "",           // Expected: false // empty string
                null,         // Expected: false // null string
                "AB1",        // Expected: true
                "AB",         // Expected: false
                "-1",         // Expected: true
                "1__&#"       // Expected: false
        };

        for (String input : testInputs) {
            System.out.println(input + " -> " + hasNumberInLastThreeChars(input));
        }
    }
}
