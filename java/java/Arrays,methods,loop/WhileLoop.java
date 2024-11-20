
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("wel come to the While loop condition\n");
         
        int i = 1;  

        
        while (i <= 100) {
            if (i % 2 == 0) {  
                System.out.println(i);  
            }
            i++; 
        }
    }
}

    
    
