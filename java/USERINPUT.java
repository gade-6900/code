import java.util.Scanner;

public class USERINPUT {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("please enter your name:");
       String name = input.nextLine();
       System.out.println("Good moring " +  name);
        System.out.print(name +",Also tell me your all information:-");
        int age =input.nextInt();
        System.out.println("Your age is:"+ age);
    }
    
}
