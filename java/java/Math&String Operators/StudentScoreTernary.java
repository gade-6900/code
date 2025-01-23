import java.util.Scanner;

public class StudentScoreTernary{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Student Score\n");
        System.out.print("plase enter the Students marks: ");
        int marks = input.nextInt();
        String category = marks > 80 ? "High" :(marks > 50 ? "moderate" : "low") ;
        System.out.println("Your category is : " + category);


    }
}