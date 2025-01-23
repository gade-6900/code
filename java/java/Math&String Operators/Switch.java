import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the day of week detector\n");
        System.out.print("Please enter your day in number: ");
        int day = input.nextInt();

        // Uncomment this if you want to use the oldSwitch method
        // oldSwitch(day);

        // Use the newSwitch method
        newSwitch(day);

        input.close(); // Close the scanner to prevent resource leaks
    }

    public static void newSwitch(int day) {
        // Using enhanced switch expression introduced in Java 14
        String dayStr = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println(dayStr);
    }

    public static void oldSwitch(int day) {
        // Using traditional switch statement
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
