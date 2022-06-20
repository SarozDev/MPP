package Lab2.prob2A;

public class OrderLine {
    public Order getOrder() {
        return order;
    }
    public Order order;
    OrderLine(Order order){
        this.order = order;
    };
}
