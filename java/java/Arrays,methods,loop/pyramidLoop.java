public class pyramidLoop {
    public static void main(String[] args) {
        int rows = 5;  
              int i = 1;    
                while (i <= rows) {

                 int j = 1;
                 while (j <= rows - i) {
                System.out.print(" ");
                j++;
            }
                
            j = 1;
             while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }

             System.out.println();
            
            i++;  
        }
    }
}
