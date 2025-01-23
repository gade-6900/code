import java.util.Scanner;

public class MaxxArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the finding the Max Array program\n");

        // Call the ArrayUtility class to input the array
        int[] arr = ArrayUtility.inputArray(input);

        int max = Integer.MIN_VALUE;

        // Find the maximum number in the array
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }

        System.out.println("Maximum number is: " + max);

        input.close(); // Closing the scanner
    }
}

class ArrayUtility {
    public static int[] inputArray(Scanner input) {
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        return arr;
    }
}
