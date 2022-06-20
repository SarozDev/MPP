package Lab9.prob11a;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000)
                , new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        Function<Employee, String> byName = Employee::getFirstName;// s-> s.firstName;

        String names = emps.stream().sorted(Comparator.comparing(byName))
                .filter(a -> a.getSalary() > 100000)
                .filter(a -> a.getLastName().charAt(0) > 'M')
                .map(a -> a.getFirstName() + " " + a.getLastName())
                .reduce("", (a, b) -> {
            return a.isEmpty() ? b : a + ", " + b;
        });


        System.out.println(names);


    }


}
