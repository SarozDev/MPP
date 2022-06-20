package Lab9.prob3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Employee {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	Function<Employee,String> byName = Employee::getName; ;// e->e.getName();
	Function<Employee,Integer> bySal = Employee::getSalary; ;// e->e.getName();
	int salary;
	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}
	@Override
	public String toString() {
		return "[" + name + ", " + salary+"]";
	}
	
	public static void main(String[] args) {


		List<Employee> list = new ArrayList<Employee>() {
			{
				add(new Employee("Joe", 50000));
				add(new Employee("Jim", 75000));
				add(new Employee("Tom", 80000));
				add(new Employee("Jim", 70000));
				add(new Employee("Steve", 55000));
				add(new Employee("Jim", 100000));
				add(new Employee("Joe", 59000));
				add(new Employee("Rich", 88000));
			}
		};


		System.out.println(
				list.stream()
						.sorted(Comparator.comparing(Employee::getName)
								.thenComparing(Employee::getSalary, Comparator.reverseOrder()))
						.collect(Collectors.toList()));


//		List<Employee> sortedEmployee = list.stream()
//				.sorted(Comparator.comparing(Employee::getName)
//				.thenComparing(Employee::getSalary,Comparator.reverseOrder()))
//				.collect(Collectors.toList());

		Function<Employee,String> byName = Employee::getName;// s->s.getName();
		Function<Employee,Integer> bySalary = s->s.getSalary();

		Comparator<Employee> byName1 = Comparator.comparing(Employee::getName);
		Comparator<Employee> bySal1 = Comparator.comparing(Employee::getSalary);

		System.out.println(list.stream().sorted(byName1.thenComparing(Employee::getSalary,Comparator.reverseOrder())).collect(Collectors.toList()));


		List<Employee> sortedEmployee = list.stream()
						.sorted(
		Comparator.comparing(byName).thenComparing(bySalary,Comparator.reverseOrder()))
								.collect(Collectors.toList());

		list.stream()
				.sorted(Comparator.comparing(byName).thenComparing(bySalary,Comparator.reverseOrder()))
						.forEach(System.out::println);

		//expected output:
		//[[Jim, 100000], [Jim, 75000], [Jim, 70000], [Joe, 59000], [Joe, 50000], [Rich, 88000], [Steve, 55000], [Tom, 80000]]
		System.out.println(sortedEmployee);
	}
}

