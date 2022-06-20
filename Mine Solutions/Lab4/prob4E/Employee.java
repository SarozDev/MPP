package Lab4.prob4E;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Account> accounts;

    Employee(String name){
        this.name = name;
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        this.accounts.add(account);
    }

    public String getName(){
        return this.name;
    }

    public double computeUpdatedBalanceSum(){
        double updatedBalance = 0.0;
        for(Account account:accounts){
            updatedBalance += account.computeUpdatedBalance();
        }

        return updatedBalance;
    }
}
