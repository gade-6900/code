import java.util.Scanner;

public class Pass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to set your password\n");
        String password;

        do {
            System.out.print("Please enter your password: ");
            password = input.nextLine(); // Use nextLine() to read a String

            if (!isValidPassword(password)) {
                System.out.println("invliad password");
            }
        } while (!isValidPassword(password));

        System.out.println("Thanks for entering a valid password.");
        input.close(); // Close the scanner
    }

    public static boolean isValidPassword(String password) {
        return password.length() > 6; // Check if the password length is greater than 6
    }
}
