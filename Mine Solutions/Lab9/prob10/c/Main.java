package Lab9.prob10.c;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> myIntStream = List.of(1, 2, 5, 9, 11, 6, 33).stream();

        myIntStream.collect(Collectors.summarizingInt(a->a));

        IntStream.of(1,2,3,4,5,6).summaryStatistics();

        IntSummaryStatistics summaryStatistics = myIntStream.collect(Collectors.summarizingInt(a -> a));

        System.out.println("Max : " + summaryStatistics.getMax() + " , Min:" + summaryStatistics.getMin());
    }
}
