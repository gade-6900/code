import java.util.Scanner;

public class AbsoluteTernary{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Absolute value\n ");
        System.out.print("please eneter your Absolute value: ");
        int num = input.nextInt();
        int result = num >= 0 ? num : -num ;
        System.out.println("Absolute value is: " + result);

         
        
    }
}
