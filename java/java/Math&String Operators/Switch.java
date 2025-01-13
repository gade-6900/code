import java.util.Scanner;
public class Switch{
    public static void main(String[]args){
        Scanner input  = new Scanner(System.in);
        System.out.println("welcome to the day of week detector\n");
        System.out.print("plaese enter your day in number: ");
        int day = input.nextInt();
         
        switch(day){
          case 1:
              System.out.println("Monday");
            break;
          case 2:
              System.out.println("tuesday");
            break;
          case 3:
               System.out.println("wednesday");
            break;
          case 4:
            System.out.println("thursday");
            break;
          
          case 5:
              System.out.println("friday");
              break;

          case 6:
               System.out.println("saturday ");
               break;

           case 7:
               System.out.println("sunday");
               break;
                        
               
               default:
                        System.out.println("invalid day");
                        break;



        }

    }
}