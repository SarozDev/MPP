package Lab8.prob5.b;

import java.util.Arrays;
import java.util.List;

public class prob5b {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        //print each element of the list in upper case format

        list.forEach(prob5b::printUpperCase);


    }

    private static void printUpperCase(String s)
    {
        System.out.println(s.toUpperCase());
    }
}
