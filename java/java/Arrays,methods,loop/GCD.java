import java.util.Scanner;

public class GCD{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("welcome to the GCD");
       System.out.print("please enter your nummber: ");
       int first = input.nextInt();
       
       System.out.println("please enter you number: ");
       int second = input.nextInt();
       int GCD = GCD(first,second);
       System.out.println("GCD of the number is: " + GCD); 

    }
    public static int GCD(int num1 , int num2 ){
        int gcd = 1;
         int i = 2;
         int least = least(num1,num2);
         while(i <= least){
            if(num1 % i == 0 && num2 % i == 0 ){
                gcd = i;
            }
            i++;
         }
        return gcd;
    }
    public static int least(int num1,int num2){
        if (num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }

}
 