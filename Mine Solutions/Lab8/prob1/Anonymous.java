package Lab8.prob1;

import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Anonymous {
    public static void main(String[] args) {
        System.out.println(new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        }.get());
    }

//    public List<String> findStartsWithLetterToUpper(List<String> list, char c) {
//        List<String> startsWithLetter = new ArrayList<String>();
//        for (String name : list) {
//            if (name.startsWith("" + c)) {
//                startsWithLetter.add(name.toUpperCase());
//            }
//        }
//
//        return startsWithLetter;
//    }
//
//    public List<String> findStartsWithUpperCase(List<String> list, char letter) {
//        return list.stream().filter(x -> x.startsWith(String.valueOf(letter))).map(x -> x.toUpperCase()).collect(Collectors.toList());
//    }
}
