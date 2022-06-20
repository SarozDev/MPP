import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        BiFunction<Double,Double, List<Double>> myFunction = (a, b)->{
            List<Double> lst =  new ArrayList<>();
            lst.add(Math.pow(a,b));
            lst.add(a*b);
            return lst;
        };

        System.out.println(myFunction.apply(2.0,3.0));

        System.out.println("Hello world!");
    }


}