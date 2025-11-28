import java.util.Scanner;
public class ExitOnExit{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        while(true) {//condition started 
            System.out.print("please enter your command: ");
            String command = input.next();//read a single word or token 
            if(command.equalsIgnoreCase("exit")){
                break;

            }
        }
        System.out.println("you have successfully exited.");

    }
}