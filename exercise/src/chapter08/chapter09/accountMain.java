package chapter08.chapter09;

import java.util.Locale;
import java.util.Scanner;

import chapter08.chapter09.entities.Account;

public class accountMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Account number: ");
        int number = sc.nextInt();
        System.out.printf("Account holder: ");
        String name = sc.next();
        sc.nextLine();
        Account account = new Account(name, number);
        System.out.printf("Initial deposit value (y/n)");
        char option = sc.next().charAt(0);
        sc.nextLine();
        if (option == 'y') {
            System.out.printf("Enter Deposit value: ");
            double deposit = sc.nextDouble();
            account = new Account(name, number, deposit);
        }
        System.out.println(account);
        System.out.println();

        System.out.printf("Deposit value: ");
        double newDeposit = sc.nextDouble();
        account.Deposit(newDeposit);
        System.out.println(account);

        System.out.println();

        System.out.printf("Withdraw value: ");
        double withdraw = sc.nextDouble();
        while (withdraw > account.getBalance()) {
            System.out.println("Unavailable balance. Balance available: " + account.getBalance());
            System.out.printf("Withdraw value: ");
            withdraw = sc.nextDouble();
        }
        account.Withdraw(withdraw);
        System.out.println(account);
        sc.close();

    }
}
