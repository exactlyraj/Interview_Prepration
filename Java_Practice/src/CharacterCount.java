import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;
public class CharacterCount {

    public static void main(String args[]){
        String s= "abhinav";

        String arr[] = s.split("");
        Map<String,Long> map = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        Map<Character,Long> map2 = s.chars().mapToObj(ch-> (char) ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map2);

    }
}
