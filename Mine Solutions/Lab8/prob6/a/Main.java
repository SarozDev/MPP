package Lab8.prob6.a;

import Lab8.prob2.a.Employee;
import Lab8.prob2.a.EmployeeNameComparator;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Main {

    enum Apple {

        Apple(){

        };
        double getWeight(){
            return 0.0;
        }
    }

    public static void main(String[] args) {


        Function<Employee,String> a = Employee::getName; //(Employee e) -> e.getName();
        BiConsumer<Employee, String> emp = Employee::setName; //(Employee e, String s) -> e.setName(s);
        BiFunction<String,String, Integer> bi = String::compareTo; ;// (String s1,String s2) -> s1.compareTo(s2);
        BiFunction<Integer,Integer,Double> pow = Math::pow;//  (Integer x,Integer y) -> Math.pow(x,y);
        Function<Apple, Double> weight = Apple::getWeight;// (Apple a) -> a.getWeight();

        //ToIntFunction<String> parse = (String x) -> Integer.parseInt(x);
        Function<String,Integer> par = Integer::parseInt;// (String x) -> Integer.parseInt(x);
        EmployeeNameComparator comp = new EmployeeNameComparator();
        BiFunction<Employee,Employee,Integer> bif = comp:: compare;  ;// (Employee e1, Employee e2) -> comp.compare(e1,e2);
    }
}
