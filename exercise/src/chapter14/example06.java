package chapter14;

import chapter14.entities.example06.Account;
import chapter14.entities.example06.BusinessAccount;
import chapter14.entities.example06.SavingsAccount;

import java.util.ArrayList;

public class example06 {
    public static void main(String[] args){


        ArrayList<Account> listAccount = new ArrayList<>();
        listAccount.add(new SavingsAccount(234, "Ana", 1000.00, 0.01));
        listAccount.add( new BusinessAccount(345, "Bob", 1000.00, 500.00));

        for (Account acc: listAccount) {
            acc.Deposit(100.00);
        }
        System.out.println(listAccount);

        for (Account acc: listAccount) {
            acc.Withdraw(10.00);
        }

        System.out.println(listAccount);

    }
}
