package chapter08.chapter9.entities;

public class Account {

    private String name;
    private int number;
    private double balance;

    public Account() {
    }

    public Account(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Account(String name, int number, double initialDeposit) {
        this.name = name;
        this.number = number;
        Deposit(initialDeposit);
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

    public double getBalance() {
        return balance;
    }

    public void Deposit(double amount) {
        this.balance += amount;
    }

    public void Withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("you dont have money");
        }
        this.balance = this.balance - amount - 5.00;
    }

    @Override
    public String toString() {
        return "Data: {\n Account: " + getNumber() +
                ", Holder: " + getName() +
                ", Balance: U$" + String.format("%.2f", getBalance()) + "\n}";
    }

}
