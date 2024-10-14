import java.util.Scanner;
public class BitwiseAND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitwise operator\n");
        System.out.print("Enter the first number: ");
        
        int first = input.nextInt();
        System.out.println("now enter the other number: ");
        
        int second = input.nextInt();

        int result = first & second;
        System.out.println("result is : " + result);

    








    }
}