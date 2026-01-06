package maven_1;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }
}
