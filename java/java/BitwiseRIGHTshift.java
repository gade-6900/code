
import java.util.Scanner;

public class BitwiseRIGHTshift{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Bitwise rightshift operator\n");
        System.out.print("enter your fisrt number: ");

        int num = input.nextInt();

        int result = num >> 1;
        System.out.println("ruselt is: " + result);
    }
}