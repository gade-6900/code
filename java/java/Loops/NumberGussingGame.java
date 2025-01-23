
import java.util.Scanner;

public class NumberGussingGame{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num = 5, guess;
        System.out.println("welcome to the gussing game");
        do { 
            System.out.print("please guess the number between 0 to 10: ");
            guess = input.nextInt();
            
        } while (num != guess);
        System.out.println("your have Successfully guess the number");
    }
}