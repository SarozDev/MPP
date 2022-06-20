package Lab5.prob4;

import java.time.LocalDate;

public class CustOrderFactory {
    public static Customer createCustomer(String name){
        Customer customer = new Customer(name);
        return  customer;
    }

    public static Order newOrder(Customer customer, LocalDate date){
        Order order = Order.newOrder(customer, date);
        return order;
    }

    public static void addItem(Order order, String name){
        order.addItem(name);
    }
}
