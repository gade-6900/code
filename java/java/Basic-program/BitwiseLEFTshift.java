
import java.util.Scanner;

public class BitwiseLEFTshift{
public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("welcome to the leftshift operator\n");
    System.out.print("enter your number: ");

    int num = input.nextInt();

    int result = num << 4;
    System.out.println("your result is: " + result);

}
}
