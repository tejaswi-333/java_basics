package banking_account;

public class Account {

    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        balance = balance + amount;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    int calculateInterest(int rate) {
        return (int)(balance * rate / 100);
    }

    int getBalance() {
        return (int) balance;
    }
}

