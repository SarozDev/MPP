package Lab8.prob2.c;

import java.util.function.Supplier;

public class Employee {
	String name;
	int salary;
	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
		sb.append(" salary: ");
		sb.append("" + salary+">");
		return sb.toString();
		
	}

	public static void main(String[] args) {
		System.out.println(new Supplier<Double>() {
			@Override
			public Double get() {
				return Math.random();
			}
		});
	}
}

