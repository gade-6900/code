
import java.util.Scanner;

public class ReturnStatement {
    public static void main(String[] args) {
        greet();

        int first = readNumber() + 1;
        int second = readNumber() + 2;

        int sum = first + second;
        System.out.println("Now show the sum of numbers: " + sum);
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        return number;
    }

    public static void greet() {
        System.out.println("Welcome to the return statement\n");
    }
}
