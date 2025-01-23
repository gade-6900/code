import java.util.Scanner;
public class Recursion{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to factorial generator\n");
        System.out.print("please enter your number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("factorial of your number is: " + fact);
     }
     public static long factorial(int num){
        System.out.println("fuction called for: " + num);// this is for to show the values of the functions 
        if(num == 1){
            return 1;

        }
        return num * factorial(num -1 );
     }



   // public static long factorialIterative(int num){
     //  long result = 1;
     //   for(int i = 1; i <= num; i++){
     //       result *= i;
     //   }
     //   return result;
    // }
}