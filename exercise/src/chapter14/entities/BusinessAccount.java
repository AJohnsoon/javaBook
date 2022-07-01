package chapter14.entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount(){
        super();
    }
    public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;

    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void Loan(double amount){
        if(amount <= loanLimit){
            balance += amount - 10.0;
        }
    }

    @Override
    public String toString() {
        return "BusinessAccount {" +
                " Number: " + this.getNumber()+
                ", Holder: "+ this.getHolder()+
                ", Balance: "+ this.getBalance()+
                ", Loan Limit: " + loanLimit +
                '}';
    }
}