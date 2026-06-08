import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class FindFerquencyOfEachCharacterInString {
    public static void main(String args[]){
        findFerquencyOfEachCharacterInString();
    }

    private static void findFerquencyOfEachCharacterInString() {
        String str = "Hello world, How are you?";
        Map<String,Long> hmp =
        Arrays.stream(str.toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
                //.entrySet().forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));
        System.out.println("Check frequency for each character "+hmp);


        // Check frequency for Letter only
        Map<Character,Long> hm =
        str.toLowerCase().chars()
                .mapToObj(ch-> (char) ch)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
                //.entrySet().forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));
        System.out.println("Check frequency for Letter only "+hm);
    }
}
