package chapter15.common.entities;

import chapter15.common.exceptions.BusinessException;

public class Account {
    private String name;
    private int number;
    private double balance;
    private double withdrawLimit = 0;


    public Account(String name, int number, double balance, double balanceLimit) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.withdrawLimit = balanceLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double balanceLimit) {
        this.withdrawLimit = balanceLimit;
    }

    public void Deposit(double amount){
        balance += amount;
    }

    public void Withdraw(double amount){
        ValidateWithdraw(amount);
        balance -= amount;
    }

    private void ValidateWithdraw(double amount) {
        if(amount > getWithdrawLimit()){
            throw new BusinessException("Error: The amount exceeds withdraw limit");
        }
        if(amount > getBalance()){
            throw new BusinessException("Error: Not enough balance");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", balance:" + balance +
                ", withdrawLimit:" + withdrawLimit +
                '}';
    }
}
