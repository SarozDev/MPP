package Lab9.prob10.a;

import java.util.Arrays;
import java.util.List;

public class Or {

    public static void main(String[] args) {
        List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));

    }

    public boolean someSimpleIsTrue(List<Simple> list) {
        boolean accum = false;
        for (Simple s : list) {
            accum = accum || s.flag;
        }
        return accum;
    }

    public boolean someSimpleIsTrue2(List<Simple> list) {

        return list.stream().map(a -> a.flag).reduce(false, (a, b) -> a || b);



    }

}
