package Lab9.prob11b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;


public class Main {
	static List<Employee> list = new ArrayList();

	public static void main(String[] args) {
		list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));


		System.out.println(result.apply(list,100000));
	}

	public static final BiFunction<List<Employee>, Integer,List<String>> result = (list, salary) ->
		list.stream()
				.sorted(Comparator.comparing(Employee::getFirstName))
				.filter(s -> s.getSalary() > salary)
				.filter(s -> s.getLastName().charAt(0) > 'M')
				.map(a -> a.getFirstName() + " " + a.getLastName())
				.collect(Collectors.toList());


}
