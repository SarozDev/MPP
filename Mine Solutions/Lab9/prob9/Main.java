package Lab9.prob9;

import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

public class Main {
    static int count = 1;

    public static void main(String[] args) {
        printSquares(4);
    }

    public static void printSquares(int num) {
        IntStream squareNumbers = IntStream.iterate(1, n -> calculateSquare(++count)).limit(num);
        squareNumbers.forEach(System.out::println);

    }

    public static int calculateSquare(int num) {
//        return (int) Math.pow(num, 2);
            return num * num;
    }

}
