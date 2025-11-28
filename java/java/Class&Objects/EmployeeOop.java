import java.util.*;
class Employee{
	private String name;
	private int id;
	private int BasicSal;
	private int progress;
	private  double inCrement;
	private double totatlSal;
	
	void setPersonInfo(String name, int id,int BasicSal){
		this.name=name;
		this.id=id;
		this.BasicSal=BasicSal;
	
	}
	void setProgress(int progress){
		this.progress=progress;
		if(progress>60){
			inCrement= BasicSal*0.30;
			totatlSal= BasicSal+inCrement;
		}else{
			inCrement=0;
			totatlSal=BasicSal;
		}
	}
	void show(){
		System.out.print("Name: "+name);
		System.out.print("Id : "+id);
		System.out.print("Basic Salaray: "+ BasicSal);
		System.out.print("Increment salary: "+ inCrement);
		System.out.print("totala salary: "+ totatlSal);
	}
}
public class EmployeeOop{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter employee name : ");
	String name = sc.nextLine();
	
	System.out.print("Enter id of employee: ");
	int id = sc.nextInt();
	
	System.out.print("enter Basic salary of employee: ");
	int BasicSal= sc.nextInt();
	
	System.out.print("Enter Progress percentage: ");
	int progress=sc.nextInt();
	
	Employee E1= new Employee();
	E1.setPersonInfo(name,id,BasicSal);
	E1.setProgress(progress);
	E1.show();
	}
}