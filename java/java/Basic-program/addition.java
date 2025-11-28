import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            sum += number; 
        }

       
        System.out.println("addition of toatal num: " + sum);
    }
}
