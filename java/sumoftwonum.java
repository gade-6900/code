import java.util.Scanner;

public class sumoftwonum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our calculater");
        System.out.print("please enter first number: ");
       
        
        int firstNum = input.nextInt();

        System.out.print("Now , please enter the second number: ");
        int secondNum = input.nextInt();
         int sum = firstNum + secondNum;
         System.out.println(" Sum of your numbers is : " + sum);
    }
    
}
