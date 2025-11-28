import java.util.Scanner;
public class BitwiseevenOdd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("welcome to the Even Odd Bitwise operator\n");
        System.out.print("Please enter your number: ");

        int num = input.nextInt();

        if ((num & 1) == 1){
            System.out.println("your number is Odd: ");

        }else{
            System.out.println("your number is even: ");
        }
    }
}