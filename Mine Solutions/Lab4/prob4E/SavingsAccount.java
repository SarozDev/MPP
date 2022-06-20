package Lab4.prob4E;

public class SavingsAccount extends Account
{
    private double balance;
    private double interestRate;
    private String acctId;

    SavingsAccount(String acctId ,double interestRate, double balance ){
        this.balance = balance;
        this.interestRate = interestRate;
        this.acctId = acctId;
    }

    @Override
    String getAccountId() {
        return null;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    double computeUpdatedBalance() {
        return balance + interestRate*balance;
    }
}
