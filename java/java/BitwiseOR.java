import java.util.Scanner;
public class BitwiseOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("BitwiseOR operator \n");
        System.out.print("enter the first number: ");

        int first = input.nextInt();
        System.out.println(" Enter the other second numbre: ");
        int second = input.nextInt();
        int result = first | second;
        System.out.println("final result is: " + result);



    }
}