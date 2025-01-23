import java.util.Scanner;
public class MultiplicationTableFor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the multiplication table\n");
        System.out.print("please enter your choice number to print the table you want: ");
        int num = input.nextInt();


        for(int i = 1; i <= 10; i++){
            System.out.println(num + "X" + i + " = " + (num*i)); 



        }
    }
}