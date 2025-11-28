class BankAccount {
    private int accountNo;
    private String holderName;
    private double balance;

    public void createAccount(int accNo, String name, double bal) {
        accountNo = accNo;
        holderName = name;
        balance = bal;
    }

    public void deposit(int amt) {
        if (amt > 0) {
            balance = balance + amt;
            System.out.println("Deposited: " + amt);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(int amt) {
        if (amt > 0 && amt <= balance) {
            balance = balance - amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void showBalance() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Current Balance: " + balance);
    }
}


public class BankHolderDetail {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.createAccount(1000, "Shubham Gade  ", 10000);
        b1.deposit(5000);
        b1.withdraw(1000);
        b1.showBalance();
    }
}
