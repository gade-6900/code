import java.util.Scanner;

public class FibonacciSeries{


  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcomw to the Fibonacci Series");
        System.out.print("please enter your number is: ");
        int num = input.nextInt();
        System.out.print("Here is the fibonacci series ");
        printFibonacci(num);



        
    }
    public static void printFibonacci(int num){
          if(num < 0) return;
          System.out.println("0 ");
          if(num == 0) return;
          System.out.print("1 ");

        int first = 0, second = 1;
        while(first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;


        }

    }

}
