public class Numberpattern{
	public static void main(String[] args){
		int n=4;
		
		for(int i=1;i<=n;i++){
			for(int s=i;s<n;s++){
			System.out.print("  ");
			}
			//to print decreasing order
			for(int j=i;j>=0;j--){
				System.out.print(j+" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}