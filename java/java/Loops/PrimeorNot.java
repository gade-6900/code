import java.util.Scanner;
public class PrimeorNot{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome the Prime checker\n");
        System.out.print("please enter your number: ");
        int num  = input.nextInt();
        boolean isPrime = isPrime(num);
        System.out.println("Your number is " + (isPrime(num) ? "Prime" : "not Prime"));


    }
    public static boolean isPrime(int num){
        for(int i = 2; i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true; 

    }
}