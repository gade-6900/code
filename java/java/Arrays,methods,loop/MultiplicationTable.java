import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("welcome to multipliaction \n");
        System.out.println("please enter your choice table num: ");
        int num =  Scanner.nextInt();
        printMultiplicationTable(num);
        
    }
    public static void printMultiplicationTable(int num){
        int i = 1;
        while ( i <= 10){
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }

    }
}