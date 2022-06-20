package Lab2.prob2A;

import java.util.UUID;

public class Factory {
    public static Order createOrder() {
        Order order = new Order(UUID.randomUUID().toString());
        OrderLine orderLine = new OrderLine(order);
        order.addOrderLine(orderLine);
        return order;
    }

//    public static void main(String[] args) {
//
//    }
}
