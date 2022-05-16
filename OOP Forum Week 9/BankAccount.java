public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        this.balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if(amount <= balance) {
            balance = balance - amount;
            return true;
        } else {
            System.out.println("Insufficient Funds.");
            return false;
        }
    }

    public void transfer(double amount, BankAccount otherAccount) {
        otherAccount.deposit(amount);
        balance = balance - amount;
    }

}