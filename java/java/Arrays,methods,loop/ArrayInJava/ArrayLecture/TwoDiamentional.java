public class TwoDiamentional{
    public static void main(String[]args){
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the 2D array
        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) { // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) { // Loop through columns
                System.out.print(matrix[i][j] + " "); // Print each element
            }
            System.out.println(); // New line after each row
        }
    }
}