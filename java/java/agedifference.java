import java.util.Scanner;

public class agedifference{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input ages
        System.out.print("Enter the age of Person 1: ");
        int age1 = scanner.nextInt();
        System.out.print("Enter the age of Person 2: ");
        int age2 = scanner.nextInt();
        
        // Calculate the age difference
        int ageDifference = Math.abs(age1 - age2);

        // Verify the age difference
        if (ageDifference == 0) {
            System.out.println("Both persons are of the same age.");
        } else if (ageDifference <= 2) {
            System.out.println("The age difference is Close.");
        } else if (ageDifference <= 5) {
            System.out.println("The age difference is Moderate.");
        } else {
            System.out.println("The age difference is Significant.");
        }

        scanner.close();
    }
}
