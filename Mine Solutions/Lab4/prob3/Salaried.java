package Lab4.prob3;

public class Salaried extends Employee {
    private double salary;

    Salaried(double salary){
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return salary;
    }

    private double getSalary(){
        return this.salary;
    }

    private void setSalary(double salary){
        this.salary = salary;
    }
}
