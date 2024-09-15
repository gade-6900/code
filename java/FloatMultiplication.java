import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("We are doing Float multiplication\n");
    System.out.print("Please Enter the first decimal nuber: ");
    double first = input .nextDouble();
    System.out.println("Now, Please enter the second decimal number: ");
    double second = input.nextDouble();

    System.out.println("\n Result: " + first * second);

    }
    
}
