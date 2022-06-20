package Lab4.prob3;

import java.util.Date;
import java.time.LocalDate;

public class Order {
    private double orderNo;
    private LocalDate orderDate;
    private double orderAmount;

    public double getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(double orderNo) {
        this.orderNo = orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }
}
