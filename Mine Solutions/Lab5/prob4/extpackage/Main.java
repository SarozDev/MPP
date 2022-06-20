package Lab5.prob4.extpackage;

import java.time.LocalDate;

import Lab5.prob4.CustOrderFactory;
import Lab5.prob4.Customer;
import Lab5.prob4.Order;
import Lab5.prob4.Item;

public class Main {
	public static void main(String[] args) {

		Customer cust = CustOrderFactory.createCustomer("Bob");

		Order order1 = CustOrderFactory.newOrder(cust,LocalDate.now());
		order1.addItem("Shorts");
		order1.addItem("Book");


//
//		Order order = Order.newOrder(cust, LocalDate.now());
//		order.addItem("Shirt");
//		order.addItem("Laptop");
//
//		order = Order.newOrder(cust, LocalDate.now());
//		order.addItem("Pants");
//		order.addItem("Knife set");

		System.out.println(cust.getOrders());
	}
}

		
