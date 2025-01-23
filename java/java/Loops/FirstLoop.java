import java.util.Scanner;
public class FirstLoop{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
       // System.out.print("please enter your age: ");
      //  int age = input.nextInt();
     //   while(age < 0 || age > 100){
     //       System.out.print("please enter your age: ");
     //       age = input.nextInt();

    //    }




    // now started do while loop in the program 
    int age = -1;
    do { 
        System.out.print("please enetr your age: ");
        age = input.nextInt();
        
    } while (age < 0 || age > 101);
        System.out.println("your age is: " + age);

    }
    
}