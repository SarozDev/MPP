package Lab2.prob2A;

import java.util.ArrayList;
import java.util.List;


public class Order {
    public String orderNum;
    private List<OrderLine> orderLine;

    Order(String orderNum){
        this.orderNum= orderNum;
        this.orderLine = new ArrayList();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public List<OrderLine> getOrderLine() {
        return orderLine;
    }

    public void addOrderLine(OrderLine _orderLine){
        if(_orderLine == null){
            throw new NullPointerException(("Orderline Is null"));
        }

        orderLine.add(_orderLine);
    }

    public void setOrderLine(List<OrderLine> orderLine) {
        this.orderLine = orderLine;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
