package foundation.Day_02;

import java.util.ArrayList;

public class Task_04 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(12000);
        b1.deposit(3000);
        double balance = b1.getBalance();
        System.out.println(balance);

        b1.withdraw(4000);
        balance = b1.getBalance();
        System.out.println(balance);
        System.out.println(b1.getTransactionHistory());
        System.out.println();
    }
}

class BankAccount {
    private double balance;
    private ArrayList<String> transactionHistory;

    BankAccount(double balance) {
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            transactionHistory.add("Deposited: " + amt + ", Balance : " + balance);
        }
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            transactionHistory.add("Withdrawn: " + amt + ", Balance : " + balance);
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    public ArrayList<String> getTransactionHistory() {
        return transactionHistory;
    }
}