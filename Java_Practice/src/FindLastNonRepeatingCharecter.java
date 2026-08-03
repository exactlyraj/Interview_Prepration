import java.util.*;
import java.util.stream.*;

public class FindLastNonRepeatingCharecter {
    public static void main(String args[]){
        findLastNonRepeatingCharecter();
    }

    public static void findLastNonRepeatingCharecter(){
        String str = "abhinavv";

        Arrays.stream(str.split("")).sorted(Collections.reverseOrder())
                .filter(x-> str.indexOf(x)==str.lastIndexOf(x))
                .reduce((x,y)-> x).ifPresent(System.out::println);


    }
}
