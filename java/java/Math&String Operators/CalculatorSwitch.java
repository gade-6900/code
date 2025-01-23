import java.util.Scanner;
public class CalculatorSwitch{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Calculator\n");
        System.out.print("please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print(" Now, enter your second number: ");
        int num2 = input.nextInt();
        System.out.print("Now enter the opeartion: ");

        String opeartion = input.next();
        int result = switch(opeartion){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;

        };
        System.out.println("Your Answer is: " + result);



    }
}