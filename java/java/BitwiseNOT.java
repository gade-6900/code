
import java.util.Scanner;

public class BitwiseNOT{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the BitwiseNOT operator\n ");
        System.out.print("enter your number: ");

        int num = input.nextInt();

        int result = ~ num;
        System.out.println("your result is: " + result);
    }
}