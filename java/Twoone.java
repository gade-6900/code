import java.util.Scanner;
public class Twoone {
    /*to check the even or odd numbers  */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("welcome to evenodd numbr checker\n");
        System.out.print("select your number: ");

        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("your number is an even number");
        }else{
            System.out.println("yourn number is a odd number.");
        }

        
    }
}