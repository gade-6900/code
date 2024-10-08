import java.util.Scanner;

public class Leapchecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the to check the year is leap or not lap year\n");
        System.out.print("PLease Enter your leap year: ");
        int year = input.nextInt();
          
            if (year % 400 == 0){
            System.out.println("your year is leap year");
        }else if ( year % 100 == 0 ){
            System.out.println(" your year is not a leapn year");
        }else if ( year % 4 == 0 ){
            System.out.println("your year is the leap year");

        }else{
            System.out.println("your year is not a leap year");
        }
    }
}
