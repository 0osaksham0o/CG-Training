package classesAndObjects;
class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}



public class Q7 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Neha", 12345678, 10000);
        account.deposit(2000);
        account.withdraw(5000);
        account.displayBalance();
    }
}
