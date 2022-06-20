package Lab4.prob3;

public abstract class Employee {
	private double empId;

	void print(){

	};

	public Paycheck calcCompensation(int month, int year){
		double grossPayment = calcGrossPay(month,year);
		return new Paycheck(grossPayment,0.23,0.05, 0.01, 0.03,0.075);
	}

	abstract double calcGrossPay(int month, int year);

}
