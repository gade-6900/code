

import java.util.Scanner;

public class arirhmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println(" Welcome to the Arithmetic calculator\n");
            System.out.println("Please enter the first number: ");
            int first = input.nextInt();
            System.out.println("Now, Enter the second number: ");
            int second = input.nextInt();

            int add = first + second;
            int sub = first - second;
            int mul = first * second;
            int div = first / second;
            int mod = first  % second;

            System.out.println("Additions is: " + add);
            System.out.println("subtraction is: " + sub);
            System.out.println("multiplication is: " + mul);
            System.out.println("division is: " + div);
            System.out.println("modulas is: " + mod);

    }
}
