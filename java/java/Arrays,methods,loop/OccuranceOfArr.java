/*7) WAP to enter the 10 element array and print the occurrence of every element ? */
import java.util.*;
public class OccuranceOfArr{
	public static void main(String args[]){
	 Scanner sc= new Scanner(System.in);
	 int a[]= new int[10];
	 int i,j;
	 int temp,count;
	 
	 System.out.println("Eneter Array: ");
	 for(i=0;i<a.length;i++){
		a[i]=sc.nextInt();
	 }
	 
	 for(i=0;i<a.length;i++){
		 for(j=0;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			 }
		}
		System.out.println("After Sorting Array: ");
        for (i = 0; i < a.length; i++) {
            System.out.printf("\t%d", a[i]);
		}
		System.out.println();
		count=1;
		for(i=0;i<a.length;i++){
			if(i==a.length-1){
				System.out.printf("\n%d----%d times", a[i], count);
				break;
			}
			if(a[i]==a[i+1]){
				count++;
			}
			else{
				System.out.printf("\n%d----%d times", a[i] , count);
				count=1;
			}
		}
			
	}
}