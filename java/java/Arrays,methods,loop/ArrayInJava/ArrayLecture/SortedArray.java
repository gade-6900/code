import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to the Array Sorting Check Program\n");
        int[] numArr = inputArray(); // Corrected to include inputArray method
        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecreasing(numArr);

        if (isDec || isInc) {
            System.out.println("Your array is sorted.");
        } else {
            System.out.println("Your array is not sorted.");
        }
    }

    // Method to check if the array is in increasing order
    public static boolean isIncreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length) {
            if (numArr[i] < numArr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    // Method to check if the array is in decreasing order
    public static boolean isDecreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length) {
            if (numArr[i] > numArr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    // Method to input an array from the user
    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numArr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numArr[i] = scanner.nextInt();
        }
        return numArr;
    }
}