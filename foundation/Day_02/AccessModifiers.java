package foundation.Day_02;

class BankAccount {
    private double balance; // Hidden from outside

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(8000);
        double b = myAccount.getBalance();
        System.out.println(b);
    }
}
