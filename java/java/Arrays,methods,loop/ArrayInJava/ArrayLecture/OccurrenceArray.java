import java.util.Scanner;
public class OccurrenceArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Occurrences Array\n");
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Enter the number you want to search: ");
        int num = input.nextInt();
        int Occurrences = noOfOccurrences( numArray, num);
        System.out.println(" your element was found: " + Occurrences + "times in teh Array");



        
    }
    public static int noOfOccurrences(int[] numArray, int num){
        int Occ = 0;
        int i = 0;
        while(i < numArray.length){
            if(numArray[i] == num ){
                Occ++;
            }

        }
        i++;
        return Occ;

    }
}