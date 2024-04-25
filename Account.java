package entities;

public class Account {
    private String holder;
    private int numberAccount;
    private double balance;

    public Account(String titular, int numberAccount) {
        this.holder = titular;
        this.numberAccount = numberAccount;
    }

    public Account(String holder, double InitialDeposit, int numberAccount) {
        this.holder = holder;
        this.numberAccount = numberAccount;
        Deposit(InitialDeposit);
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void getNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void Deposit(double balance) {
        this.balance += balance;
    }

    public void Saque(double balance) {
        this.balance -= balance;
        this.balance  -= 5;
    }

    public String toString() {
        return "Account "+numberAccount
                +", Holder: "+holder
                +", Balance: $ "+String.format("%.2f",getBalance());
    }
}
