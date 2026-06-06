import java.util.*;
import java.util.stream.*;

public class FindSecondLargestNumberinArray {
    public static void main(String args[]){
        findSecondLargestNumberinArray();
    }

    public static void findSecondLargestNumberinArray(){
        Integer arr[] = {10,5,8,25,20,25};
        Optional <Integer> s = Arrays.stream(arr)
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst();
                //.ifPresent(System.out::println);
        System.out.println(s);
    }
}
