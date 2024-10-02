import java.util.Scanner;
public class relational{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Wel to the druveing Lincens Portal");
        System.out.print(" please enter your ages:  ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("you are eligible to drive");



        }else {
            System.out.println("Beta cycle chalao");
        }
    }

}