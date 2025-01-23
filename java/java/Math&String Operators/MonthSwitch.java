import java.util.Scanner;
public class MonthSwitch{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Month mapping\n");
        System.out.print("please enter your month number: ");
        int monthNum = input.nextInt();
        String monthName = getMonthName(monthNum);
        System.out.println("your month name is: " + monthName);

    }
    public static String getMonthName(int monthNum){
        return switch (monthNum){
            case 1 -> "january";
            case 2 -> "february";
            case 3 -> "march";
            case 4 -> "april";
            case 5 -> "may";
            case 6 -> "june";
            case 7 -> "july";
            case 8 -> "august";
            case 9 -> "september";
            case 10 -> "october";
            case 11-> "november";
            case 12-> "december";
            default -> "marc month";

        };
    }
 }
