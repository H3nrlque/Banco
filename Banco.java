package application;

import entities.Account;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Account account;
        System.out.print("Enter account number: ");
        int numberAccount = tc.nextInt();
        tc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = tc.nextLine();
        System.out.print("Is there na initial deposit[Y/N]: ");
        String res = tc.next();

        if (res.equals("Y")) {
            System.out.print("Enter initial deposit value: $ ");
            double InitialDeposit = tc.nextDouble();
            account = new Account(holder, InitialDeposit, numberAccount);
        } else {
            account = new Account(holder, numberAccount);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double deposit = tc.nextDouble();
        account.Deposit(deposit);
        System.out.println("Updated account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double saque = tc.nextDouble();
        account.Saque(saque);
        System.out.println("Updated account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Do you want to change the account holder[Y/N]: ");
        res = tc.next();
        tc.nextLine();
        if (res.equals("Y")) {
            System.out.print("Enter the new account holder: ");
            holder = tc.nextLine();
            account.setHolder(holder);
        }

        System.out.println("Updated account data: ");
        System.out.println(account);

        tc.close();
    }
}
