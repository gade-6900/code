import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(" Welcom t perimeter calculation");
            System.out.print(" Please enter the all 4 side in cm: ");

            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            double d = input.nextDouble();

            double perimeter = a+b+c+d;
            System.out.println("perimeter of your rectangle is: " + perimeter + "cms");
        }

    }
    
}
