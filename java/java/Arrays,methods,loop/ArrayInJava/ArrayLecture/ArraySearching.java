
import java.util.Scanner;

public class ArraySearching{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int[] Arr = {3,6,9,12,15,18,21,24,27,30};
        System.out.println("welcome to the array searching algorithm\n");
        System.out.print("Enter the number you want to search: ");
        int num = input.nextInt();
        boolean isFound = isFound(Arr, num);
        if(isFound){
            System.out.println("your number is found in the array ");
        }else{
            System.out.println("your number is not found in the Array");
        }

    }
    public static boolean isFound(int Arr[], int num){
        int index = 0;
        while(index < Arr.length){
            if(Arr[index] == num ){
            return true;
            }
            index++;
        }
        return false;
    }
}