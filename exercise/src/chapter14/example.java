package chapter14;

import chapter14.entities.Account;
import chapter14.entities.BusinessAccount;

public class example {
    public static void main(String[] args){
        Account acc = new Account(123456, "Allan");
        acc.Deposit(600);
        acc.Withdraw(30);
        System.out.println(acc);

        BusinessAccount businessAccount = new BusinessAccount(123, "Pedro", 6000.00, 1500);
        businessAccount.Loan(1500);
        System.out.println(businessAccount);
    }
}
