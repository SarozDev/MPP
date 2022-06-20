package Lab4.prob3;

public class Hourly extends Employee {
    private double hourlyWage;
    private double hoursPerWeek;

    Hourly(double hourlyWage, double hoursPerWeek){
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return hourlyWage * hoursPerWeek * 4;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
}
