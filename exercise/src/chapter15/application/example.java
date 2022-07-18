package chapter15.application;


import chapter15.common.entities.Account;
import chapter15.common.exceptions.BusinessException;

public class example {
    public static void main(String[] args){

        Account acc1 = new Account("Bob Brown", 9876, 500.00, 300.00);
        double accWithdraw1 = 800.00;
        try{
            acc1.Withdraw(accWithdraw1);
            System.out.printf("Novo saldo: %.2f%n", acc1.getBalance());

        }
        catch (BusinessException e){
            System.out.println(e.getMessage());
        }

        Account acc2 = new Account("Alex Green", 1234, 200.00 , 300.00);
        double accWithdraw2 = 250;
        try{
            acc2.Withdraw(accWithdraw2);
            System.out.printf("Novo saldo: %.2f%n", acc2.getBalance());

        }
        catch (BusinessException e){
            System.out.println(e.getMessage());
        }

    }
}
