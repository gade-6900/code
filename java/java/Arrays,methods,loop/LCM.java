import java.util.Scanner;

public class LCM{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the LCM least commonn multiple ");
        System.out.print("please enter your choice number: ");
        int first = input.nextInt();

        System.out.print("please enter your choice number: ");
        int second = input.nextInt();
        
        int LCM = LCM (first, second);
        System.out.println("LCM of the two numbers is: " + LCM);

    }
     public static int LCM(int first , int second){
        int i = 1;
        while (true) {
            int factor = first * i;
           if (factor  % second == 0){
            return factor;

           }
         i++;

        } 
        

     }
}