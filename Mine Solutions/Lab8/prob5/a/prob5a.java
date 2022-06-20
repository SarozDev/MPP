package Lab8.prob5.a;

import java.util.Arrays;
import java.util.List;

public class prob5a {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        //print each element of the list in upper case format

        list.forEach(s-> System.out.println(s.toUpperCase()));


    }

   }
