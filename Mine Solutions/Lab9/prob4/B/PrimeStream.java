package Lab9.prob4.B;

import java.util.stream.Stream;

public class PrimeStream {

    public Stream<Integer> createStream() {
        Stream<Integer> primes = Stream.iterate(2, s -> {

            do {
                s = s + 1;
            } while (!isPrimeNumber(s));

            return s;
        });

        return  primes;
    }

    private boolean isPrimeNumber(Integer n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void printFirstNPrimes(int n){
        createStream().limit(n).forEach(System.out::println);
    }

    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream(); //
        // PrimeStream is enclosing class
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }
}
