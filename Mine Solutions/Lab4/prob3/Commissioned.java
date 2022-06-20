package Lab4.prob3;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Commissioned extends Employee {
    private double commission;
    private double baseSalary;
    private List<Order> orders;

    Commissioned(double commission, double baseSalary) {
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = new ArrayList<>();

    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        LocalDate firstOfCurrentMonth = LocalDate.of(year, month, 1);
        double orderForThisMonth = 0.0;

        for (Order order : orders) {
            if (checkPreviousDate(firstOfCurrentMonth, order.getOrderDate()))
                orderForThisMonth += order.getOrderAmount();
        }


        return baseSalary + commission * orderForThisMonth;
    }

    private boolean checkPreviousDate(LocalDate currentDate, LocalDate previousDate) {
        int currentMonth = currentDate.getMonthValue();
        int previousMonth = previousDate.getMonthValue();
        int currentYear = currentDate.getYear();
        int previousYear = previousDate.getYear();

        if (currentMonth - previousMonth == 1 && currentYear == previousYear) {
            return true;
        }

        return false;
    }
}
