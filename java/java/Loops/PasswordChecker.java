import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        // Predefined valid password
        final String VALID_PASSWORD = "pass6900";

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            // Prompt the user to enter the password
            System.out.print(" Please Enter your password: ");
            userInput = scanner.nextLine();

            // Check if the entered password is valid
            if (!userInput.equals(VALID_PASSWORD)) {
                System.out.println("Invalid password. Please try again.");
            }
        } while (!userInput.equals(VALID_PASSWORD)); // Continue until the password is correct

        // Password is correct
        System.out.println("Access granted. Welcome!");

        // Close the scanner
        scanner.close();
    }
}
