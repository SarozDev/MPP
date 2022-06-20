package Lab8.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class prob3 {
    public static void main(String[] args) {
        BiFunction<Double, Double, List<Double>> f = (x, y) -> {
            List<Double> lst = new ArrayList<>();
            lst.add(Math.pow(x, y));
            lst.add(x * y);
            return lst;
        };

        System.out.println(f.apply(2.0, 3.0));


    }
}


