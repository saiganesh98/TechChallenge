
# TechChallenge

## Description
This project contains a Java program that checks whether the last three characters of a given string include a digit. It features a main class, LastThreeCharsDigitChecker, which includes a function to perform the check and demonstrates its functionality with various test cases.

## Function
- [`hasNumberInLastThreeChars`](https://github.com/saiganesh98/TechChallenge/blob/main/src/main/java/LastThreeCharsDigitChecker.java#L17): Checks if the last three characters of a string contain a digit.

### Example
- **Input**: `"Test8RE"`
- **Output**: `true` (because '8' is within the last 3 characters "8RE")

## Features
- Handles null and empty strings safely.
- Works with strings of any length.
- Uses Java Streams for efficient digit checking.

## Prerequisites
- **Java**: Version 17 or higher.
- **Maven**: Ensure Maven is installed and configured.

## How to Run

### Directly in Intellij IDEA
You can directly run the LastThreeCharsDigitChecker main class in IntelliJ IDEA by right-clicking on the file and selecting the Run 'LastThreeCharsDigitChecker.main()' option.

### Using Maven
1. **Compile the project**:
   ```bash
   mvn compile
   ```

2. **Run the program**:
   ```bash
   mvn exec:java -Dexec.mainClass=LastThreeCharsDigitChecker
   ```

## Running Tests
To run the TestNG test cases:

1. **Run tests using Maven**:
   ```bash
   mvn test
   ```

2. **Run tests directly in IntelliJ IDEA**:
    - Right-click on the `LastThreeCharsDigitCheckerTest` class in the `src/test/java` directory.
    - Select **Run 'LastThreeCharsDigitCheckerTest'**.

## Project Structure
```
TechChallenge/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── LastThreeCharsDigitChecker.java
│   └── test/
│       └── java/
│           └── LastThreeCharsDigitCheckerTest.java
├── pom.xml
└── README.md
```

## Example Output
```
Test8RE -> true
HelloXYZ -> false
99 -> true
Hi123 -> true
H -> false
 -> false
null -> false
AB1 -> true
AB -> false
-1 -> true
1__&# -> false
```

## Plugins & Dependencies
- **Maven Plugins**:
    - `maven-compiler-plugin` (for compiling Java code)
    - `exec-maven-plugin` (for running the main class)
- **TestNG Dependency**: For writing and running test cases.
