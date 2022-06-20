package Lab4.prob4E;

public class CheckingAccount extends Account{
    private double balance;
    private double monthlyFee;
    private String acctId;

    CheckingAccount(String acctId, double monthlyFee, double balance ){
        this.balance = balance;
        this.monthlyFee = monthlyFee;
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
        return balance-monthlyFee;
    }
}
