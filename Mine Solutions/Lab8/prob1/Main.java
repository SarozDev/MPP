package Lab8.prob1;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //q1 ii
        //Supplier<Double> rr = () -> Math.random();

        Supplier<Double> random = Math::random;
        System.out.println(random.get().doubleValue());

        //q2 iii
        System.out.println(new Main().new Random().get());

//        Double s = random.get();
      //  double x -> Math.random();


    }


    class Random implements Supplier<Double>{
        @Override
        public Double get() {
            return Math.random();
        }
    }


}
