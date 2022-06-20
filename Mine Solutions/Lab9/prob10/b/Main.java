package Lab9.prob10.b;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lst = List.of("Bill", "Thomas", "Mary");

//        System.out.println(lst.stream().reduce("", (a, b) -> {
//            if(a.isEmpty()){
//                return b;
//            }
//            return a + "," + b;
//        }));


        System.out.println(lst.stream()
                .reduce("", (a, b) -> {
                    return a.isEmpty() ? b : a + "," + b;
                }));

    }
}
