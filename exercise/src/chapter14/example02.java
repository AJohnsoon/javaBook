package chapter14;

import chapter14.entities.Account;
import chapter14.entities.BusinessAccount;
import chapter14.entities.SavingsAccount;

public class example02 {
    public static void main(String[] args){

        BusinessAccount businessAccount = new BusinessAccount(4321, "Maria", 0.0, 500.0);

        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(4879, "Bob", 0.0, 300.00);
        Account account3 = new SavingsAccount(44230, "Helena", 200.00, 0.01);
        System.out.println("Upcasting:");
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println();

        System.out.println("Downcasting:");
        BusinessAccount businessAccount1 = (BusinessAccount) account1;
        BusinessAccount businessAccount2 = (BusinessAccount) account2;


        System.out.println(businessAccount1);
        System.out.println(businessAccount2);

        if(account3 instanceof BusinessAccount){
            BusinessAccount businessAccount3 = (BusinessAccount) account3;
            businessAccount3.Loan(1);
            System.out.println("Loan: "+businessAccount3);
        }

        if(account3 instanceof SavingsAccount){
            SavingsAccount savingsAccount = (SavingsAccount) account3;
            savingsAccount.updateBalance();
            System.out.println("Update: "+savingsAccount);
        }



    }
}
