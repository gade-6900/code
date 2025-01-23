import java.util.Scanner;
public class MinimumTernary{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcomw to the finding  minimum\n");

        System.out.print("please enter your first number: ");
        int num1 = input.nextInt();

        System.out.print("please enter your second number: ");
        int num2 = input.nextInt();
        MinimumTernary ternary = new MinimumTernary();
        int min = ternary.min(num1, num2);
        System.out.println("minimum number is: " + min);

    }
    public int min(int num1, int num2){
        return num1 < num2 ? num1 : num2;
        

     
    }
}