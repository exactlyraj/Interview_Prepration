import java.util.*;
import java.util.stream.*;
import java.util.function.*;


public class FindDuplicateElementsFromList {

    public static void main(String args[]){
        findDuplicateElementsFromList();
    }

    public static void findDuplicateElementsFromList(){
        List<Integer> list = List.of(1,1,2,3,5,5,6,7,4,5,18,11,5,18);
        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(x-> x.getValue()>1)
                .forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));

        /* printing the duplicate number only*/
        list.stream()
                .filter(count-> Collections.frequency(list,count)>1)
                .forEach(System.out::println);
    }
}