import java.util.Scanner;

public class PrimeChecker{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the prime nmber checker");
        System.out.print("please enter your choice number: ");
        int num = input.nextInt();
        boolean  isPrime = isPrime(num);
        if(isPrime){
            System.out.println("your nnumber is prime");
        }else{
            System.out.println("your number is not prime");
        }
    }
    public static  boolean isPrime(int num ){
        int i =2;
        while(i < num){
            if(num % i == 0){
                return false;

            }
            i++;
        }
    
        return false;

    }
}