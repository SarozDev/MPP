package Lab9.prob4.A;

import java.util.stream.Stream;

public class Prob4A {
    static final private Stream<Integer> primes = Stream.iterate(2, s -> {
        do {
            s = s + 1;
        } while (!isPrimeNumber(s));

        return s;
    });

    public static void main(String[] args) {
        primes.limit(100).parallel()
                .forEach(System.out::println);
    }

    private static boolean isPrimeNumber(Integer n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
