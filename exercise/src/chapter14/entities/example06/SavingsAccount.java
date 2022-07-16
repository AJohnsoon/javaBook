package chapter14.entities.example06;

public final class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override
    public void Withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        return "\n  SavingsAccount {" +
                " Number: " + this.getNumber() +
                ", Holder: " + this.getHolder() +
                ", Balance: " + this.getBalance() +
                ", interestRate: " + interestRate +
                " }";
    }
}
