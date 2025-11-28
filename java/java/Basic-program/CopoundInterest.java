
public class CompoundInterest{
public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
System.out.println("Welcome to the Compound interest\n");
System.out.print(" now enter the Amout of interest: ");
int principle = input.nextInt();
 System.out.print(" now tell me your rate of interest:");
 float rate = input.nextInt();
 System.out.print("now tell me for how many years are you barrow: ");
 float years  = input.nextInt();

 double CompoundInterest = principle ( 1 + rate /100), years;
 System.out.println(" your Rs: " + interest);


    }
}