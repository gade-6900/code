import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the reverse number checker");
        System.out.print("please enter your number: ");
        int num = input.nextInt();
        int reverse = reverseDigits(num);
        System.out.println("Reverse of your number is: " + reverse);

    }
    public static int reverseDigits(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;  // Extract the last digit
            reversed = reversed * 10 + digit;  // Append the digit to the reversed number
            num /= 10;  // Remove the last digit
        }

        return reversed;
    }
}