import java.util.Scanner;
public class ageseries {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the AgeSeries\n");
        System.out.print("Enter your Age: ");

        int age = input.nextInt();

        if(age >= 65){
            System.out.println("you are Senior citizen, and now you have to go in heaven");

        }else if(age >=20){
            System.out.println("you are an adult now earn money to live on the earth");

        }else if (age >=13){
            System.out.println("you are now in Teen age study hard and become a good person in your life ");

        }else{
            System.out.println("you are child go to the school and study & play any game");
        }
    }
}
