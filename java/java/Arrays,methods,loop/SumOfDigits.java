import java.util.Scanner;

public class SumOfDigits{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the sum of digits program ");
        System.out.print("please enetr the number: ");
        int num = input.nextInt();
        int sum = SumOfDigits(num);
        System.out.println("Sum of Digits is : " + sum);
    }
    public static int SumOfDigits(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}