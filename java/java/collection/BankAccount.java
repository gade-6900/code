interface Loan{
    void applyLoan(double loanAmount);
}
class Account {
    protected int AccNo;
    protected String holderName;
    protected double balance;

    public Account(int AccNo,String holderName,double balance){
        this.AccNo=AccNo;
        this.holderName=holderName;
        this.balance=balance;
    }
    public void displayDetail(){
        System.out.println("Account Number: "+AccNo);
        System.out.println("Account Holder Name: "+holderName);
        System.out.println("Balance : " +balance);
    
    
    }
}
class  SavingAccount extends Account implements Loan{
    public  SavingAccount(int AccNo,String holderName,double balance){
        super(AccNo,holderName,balance);
    }
    public void applyLoan(double loanAmount){
        if(balance>50000){
            balance = balance+loanAmount;
            System.out.println("Loan of "+ loanAmount  + " Approved for Saving Account.");

        }else{
            System.out.println("Loan not approve! minimum balance of 50000 required .");
        }
    }
}
    class CurrentAccount extends Account implements Loan{
        public CurrentAccount(int AccNo,String holderName,double balance){
            super(AccNo,holderName,balance);
        }
        public void applyLoan(double loanAmount){
            if(balance>100000){
                    balance = balance+loanAmount;
                    System.out.println("Loan of "+ loanAmount+" approved for current Account.");
            }else{
                System.out.println("Loan not aprove ! minum balance of 50000 100000 required.");
            }
        }
    }


public class BankAccount{
    public static void main(String [] args){
        SavingAccount sa = new SavingAccount(101,"Shubham",60000);
        sa.displayDetail();
        sa.applyLoan(20000);
        sa.displayDetail();

        System.out.println("----------------------");

         
        CurrentAccount ca = new CurrentAccount(102,"Yash",90000);
        ca.displayDetail();
        ca.applyLoan(50000);
        ca.displayDetail();
        System.out.println("----------------------");
        
    }
}