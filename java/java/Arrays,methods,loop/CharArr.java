import java.util.*;
public class CharArr{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	char ch[]= new char[5];
	System.out.println("Enter Charctor: ");
		for(int i=0;i<ch.length;i++){
		ch[i]= sc.nextLine().charAt(0);
		}
		System.out.println("Display Arr before covert: ");
		for(int i=0;i<ch.length;i++){
			System.out.printf("%4c",ch[i]);
			if(ch[i]>='a'&&ch[i]<='z'){
				ch[i]=(char)((int)ch[i]-32);
			}
		}
		System.out.println("\nDisplay Array after convert: ");
			for(int i=0;i<ch.length;i++){
				System.out.printf("%4c",ch[i]);
			}
	}
}