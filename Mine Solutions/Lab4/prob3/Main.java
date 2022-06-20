package Lab4.prob3;

public class Main {
    public static void main(String[] args) {
        Salaried salaried = new Salaried(1500);
        System.out.println("gross sal : " + salaried.calcGrossPay(1,2));
        System.out.println("netpay : " + salaried.calcCompensation(1,2).getNetPay());


        }
}
