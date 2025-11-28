import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the grade calculation\n");
        System.out.print("Enter  your  percentage: ");
        float percentage = input.nextFloat();


    if(percentage >= 90) {
        System.out.println(" Grate you have Got A Grade");

    }else if(percentage >= 75){
        System.out.println("you have Got B Grade ");
         
    }else if(percentage >= 60){
        System.out.println("you have got C Grade");

    }else if(percentage >= 30){
        System.out.println("you have got D Grade");

    }else{
        System.out.println(" Sorry , your are failed in the exam better luck next time ");
    }
    }
}