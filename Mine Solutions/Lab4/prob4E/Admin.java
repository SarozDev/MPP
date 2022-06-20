package Lab4.prob4E;

import java.util.List;

public class Admin {
    public static double updatedBalanceSum;
    public static double computeUpdatedBalanceSum(List<Employee> listEmployee) {
        //implement
        updatedBalanceSum = 0.0;

        for(Employee employee:listEmployee){
            updatedBalanceSum += employee.computeUpdatedBalanceSum();
        }

        return updatedBalanceSum;
    }
}
