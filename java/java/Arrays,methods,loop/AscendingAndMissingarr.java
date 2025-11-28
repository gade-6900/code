import java.util.*;
public class AscendingAndMissingarr{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]= new int[5];

        System.out.println("Eneter 5 Array: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("missing elements");
        boolean foundArr=false;

        for(int i=0;i<a.length-1;i++){
            int first=a[i];
            int last=a[i+1];

        for(int j=first+1;j<last;j++){
            System.out.print(j+" ");
        }    
        }
        if(!foundArr){
            System.out.print("none: ");
        }
        System.out.println();
    }
}