import java.util.Scanner;
public class OddEvenTernary{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Odd/Even number\n");
        System.out.print("please enter your first number: ");
        
        int num = input.nextInt();
        String result = num % 2 == 0 ? "Even" : "Odd";
         System.out.println(" your number is: " + result);
    }
}