import java.util.Scanner;
public class TernaryOperator{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the number checker\n");
        System.out.print("please enter your first number: ");
        int val1 = input.nextInt();
        System.out.print("Now  enter your second number: ");
        int val2  = input.nextInt();

      //   int greaterNumber;
       //  if(num1 > num2){
        //    greaterNumber = num1;
       //  }else{
       //     greaterNumber = num2;
       //  }
int greaterNumber = val1 > val2 ? val1 : val2;  // this is the ternary operator//
        System.out.println(greaterNumber +  " is the gratest number");


    }
}