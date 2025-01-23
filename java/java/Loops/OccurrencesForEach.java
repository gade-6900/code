import java.util.Scanner;
public class OccurrencesForEach{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Finding Occurrrences\n");
        int[] array = {1,1,2,3,4,5,6,7,8,8,9,9,9,10};
        System.out.print("now enter the number you want tu search: ");
        int element = input.nextInt();
        int occ = countOccurrences(array, element);
        System.out.println("your element was found: " + occ + " times.");



    }
    public static int countOccurrences(int[] array, int element){
        int occ = 0;
        for(int num : array){
            if(num == element){
                occ++;
            }
        }
        return occ;
    }
}