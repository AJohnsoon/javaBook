package chapter14;

import chapter14.entities.example.Account;
import chapter14.entities.example.BusinessAccount;
import chapter14.entities.example.SavingsAccount;

public class example03 {
    public static void main(String[] args){
        Account acc1 = new Account(1001, "Alex Green", 1000.00);
        acc1.Withdraw(200.00);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(9441, "Maria Green", 1000.00, 0.01);
        acc2.Withdraw(200.00);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(4321, "Daniel Green", 1000.00, 500.00);
        acc3.Withdraw(200.00);
        System.out.println(acc3.getBalance());
    }
}
