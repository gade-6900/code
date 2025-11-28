import java.util.*;
public class SumOfNaturalNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int sum;
        for(sum=0;sum<=n;sum++){
            sum = sum+1;
        }
        System.out.println("sum is "+ sum);

        

    }
}