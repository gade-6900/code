import java.util.Scanner;

public class Fibonacci{

    // Function to display the Fibonacci series up to a certain number
    public static void fibonacciSeries(int limit) {
        int a = 0, b = 1;
        
        // Print Fibonacci numbers until the limit
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the limit
        System.out.print("Enter a number to display the Fibonacci series up to: ");
        int limit = scanner.nextInt();
        
        // Call the function to display the Fibonacci series
        fibonacciSeries(limit);
        
        // Close the scanner
        scanner.close();
    }
}
