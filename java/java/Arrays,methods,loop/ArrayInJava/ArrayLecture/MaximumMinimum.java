public class MaximumMinimum {
    public static void main(String[] args) {
        System.out.println("Welcome to Max Min\n");

       
        int[] numArr = ArrayUtility.inputArray(); 
        
        int max = Max(numArr);
        int min = Min(numArr);

        System.out.println("Max of the Array is: " + max);
        System.out.println("Min of the Array is: " + min);
    }

    public static int Min(int[] numArr) {
        int min = Integer.MAX_VALUE; 
        int i = 0;

        while (i < numArr.length) {
            if (min > numArr[i]) {
                min = numArr[i];
            }
            i++;
        }
        return min; 
    }
    public static int Max(int[] numArr) {
        if (numArr.length == 0) {
            return Integer.MIN_VALUE; 
        }

        int max = numArr[0];
        int i = 1;

        while (i < numArr.length) {
            if (max < numArr[i]) {
                max = numArr[i];
            }
            i++;
        }
        return max; 
    }
}
