import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest calculaton");
        System.out.print("Enter your principle amount Rs");
        int principle = input . nextInt();
        System.out.print(" now tell me your rate of interest: ");
        float rate = input.nextInt();
        System.out.print("now tell me for how many years are you barrow: ");
        float years  = input.nextInt();
        float interest = ( principle * rate * years ) / 100;
        System.out.println("\n\n Your Simple Interest ps Rs: " + interest);

    }
    
}
