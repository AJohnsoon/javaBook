package chapter14.entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance = 0.0;

    public Account(){}

    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(Integer number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void Deposit(double amount){
        balance += amount;
    }
    public void Withdraw(double amount){
        balance -= amount + 5;
    }

    @Override
    public String toString() {
        return "Account {" +
                "  number: " + number +
                ", holder: " + holder +
                ", balance: " + balance +
                " }";
    }
}
