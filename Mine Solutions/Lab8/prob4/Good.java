package Lab8.prob4;

import java.util.List;
import java.util.stream.Collectors;

public class Good {
    public static void main(final String[] args) {
        Good good = new Good();

        List<String> lst = List.of("Cat","Dog","hari");
        System.out.println(good.countWords(lst,'C','D',3));

    }

    public int countWords(List<String> words, char c, char d, int len) {
        return checkCharacterNotPresent(checkCharacterPresent(checkLengthPresent(words,len),c),d).size();
    }

    private List<String> checkCharacterPresent(List<String> words, char c) {
        return
                words.stream()   //convert list to stream
                        .filter(name -> name.contains(String.valueOf(c))) //returns filtered stream
                        .collect(Collectors.toList()); //organizes into a list
    }

    private List<String> checkLengthPresent(List<String> words, int len) {
        return
                words.stream()   //convert list to stream
                        .filter(name -> name.length() == len) //returns filtered stream
                        .collect(Collectors.toList()); //organizes into a list
    }


    private List<String> checkCharacterNotPresent(List<String> words, char d) {
        return words.stream()
                .filter(x -> !x.contains(String.valueOf(d)))
                .collect(Collectors.toList());

    }
}
