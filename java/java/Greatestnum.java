import java.util.Scanner;
public class Greatestnum{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the greatest number checker\n");

        System.out.print("Please enter your First number: ");
        int First = input.nextInt();

        System.out.print("Enter your Second Number: ");
        int Second = input.nextInt();

        System.out.print("Enter your Third number: ");
        int Third = input.nextInt();

       if(First >= Second && First >= Third){
            System.out.println(First + " is the greatest number");
        }else if( Second >= Third){
            System.out.println(Second + " is the greatest number");
        }else{
            System.out.println(Third + " is the  greatest number");
        }


    }
}