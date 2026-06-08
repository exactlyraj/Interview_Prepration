import java.util.*;
import java.util.stream.Collectors;


public class FindUniqueCharacterFromListOfWords {
    public static void main(String args[]) {
        findUniqueCharacterFromListOfWords();
    }

    //Given a list of words, return a list of unique characters across all words.
    public static void findUniqueCharacterFromListOfWords() {
        List<String> listofString = List.of("Hello", "how", "are", "You", "how");

        List<Character> listofStringresp =
        listofString.stream()
                .flatMap(str-> str.chars().mapToObj(ch -> (char)ch))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listofStringresp);
     }
}