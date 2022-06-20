package Lab8.prob6.b;

import Lab8.prob2.a.Employee;
import Lab8.prob2.a.EmployeeNameComparator;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Main {

    enum Apple {
        WEIGHT;
        Apple(){

        };
        double getWeight(){
            return 0.0;
        }
    }

    static class MyClass implements BiFunction<Double,Double,Double>{
        @Override
        public Double apply(Double aDouble, Double aDouble2) {
            return Math.pow(aDouble,aDouble2);
        }
    }


    private Function<Employee,String> a = Employee::getName; //(Employee e) -> e.getName();
    private BiConsumer<Employee, String> emp = Employee::setName; //(Employee e, String s) -> e.setName(s);
    private BiFunction<String,String, Integer> bi = String::compareTo; ;// (String s1,String s2) -> s1.compareTo(s2);
    private BiFunction<Integer,Integer,Double> pow = Math::pow;//  (Integer x,Integer y) -> Math.pow(x,y);
    private BiFunction<Double,Double,Double> power = new MyClass();//  (Integer x,Integer y) -> Math.pow(x,y);
    private Function<Lab8.prob6.b.Main.Apple, Double> weight = Lab8.prob6.b.Main.Apple::getWeight;// (Apple a) -> a.getWeight();

    ToIntFunction<String> parse = (String x) -> Integer.parseInt(x);
    private Function<String,Integer> par = Integer::parseInt;// (String x) -> Integer.parseInt(x);
    private EmployeeNameComparator comp = new EmployeeNameComparator();
    private BiFunction<Employee,Employee,Integer> bif = comp:: compare;  ;// (Employee e1, Employee e2) -> comp.compare(e1,e2);

    public void evaluator(){
        Employee emp = new Employee("Sandy",5);
        Employee emp1 = new Employee("Sanny",5);
        System.out.println(a.apply(emp));
        this.emp.accept(emp,"RAM");


        System.out.println(a.apply(emp));

        System.out.println(bi.apply("ac","bc"));
        System.out.println(pow.apply(2,3));
        System.out.println(weight.apply(Apple.WEIGHT));
        System.out.println(parse.applyAsInt("4"));
        System.out.println(par.apply("5"));
        System.out.println(comp.compare(emp,emp1));

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.evaluator();


    }
}
