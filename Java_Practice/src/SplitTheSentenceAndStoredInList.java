import java.util.*;
import java.util.stream.*;

public class SplitTheSentenceAndStoredInList {
    public static void main(String args[]){
        splitTheSentenceAndStoredInList();
    }

    private static void splitTheSentenceAndStoredInList() {
        List<String> list = Arrays.asList("Hi My Name Is Abhinav","How Are You.","I am Good");
        List<String> list1 = List.of("Hi My Name Is Abhinav","How Are You.","I am Good");

        List<String> resp = list.stream()
                .map(str-> str.split(" "))
                .flatMap(str-> Arrays.stream(str))
                .collect(Collectors.toList());

        System.out.println(resp);
       // System.out.println(list1);
    }
}
