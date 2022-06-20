package  Lab2;

import Lab2.prob2A.Factory;
import Lab2.prob2A.Order;
import Lab2.prob2B.Student;
import Lab2.prob2B.StudentGradeReport;

public class Main {
    public static void main(String[] args) {
        Order order = Factory.createOrder();
        System.out.println(order.getOrderNum());
        System.out.println("Number of orders " + order.getOrderLine().size());

        Student st = StudentGradeReport.createStudent("Saroj");
        System.out.println((st.getName()));
        System.out.println((st.getGradeReport()));
    }
}