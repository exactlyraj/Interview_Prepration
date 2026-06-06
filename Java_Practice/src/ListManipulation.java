import java.util.*;
import java.util.stream.*;

public class ListManipulation {
    public static void main (String args[]){
        flatterMap();
        convertArraytoArrayList();
        convertanArrayListtoanArray();
        sortAnArraylist();
        findMaxandMin();
        filterFromArrayList();

    }
    //Convert combination of list to plain list
    public static void flatterMap(){
        //[1,2, [3,4],[5]]
        List<List<Integer>> li = List.of(List.of(1,2),List.of(3,4),List.of(5));
        System.out.println(
                li.stream()
                        .flatMap(x-> x.stream().sorted())
                        .collect(Collectors.toList()));
    }

    //How to convert an Array to an ArrayList in Java 8?
    public static void convertArraytoArrayList(){
        Integer arr[] = {1,2,3,4,5,6};

        //Using Arrays.asList (fixed-size list)
        System.out.println(Arrays.asList(arr));

        // Using Java 8 Streams (modifiable list)
        System.out.println(Arrays.stream(arr).collect(Collectors.toList()));
    }

    //How to convert an ArrayList to an Array in Java 8?
    public static void convertanArrayListtoanArray(){
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(1);

        Integer arr[] = list.toArray(new Integer[0]);
        System.out.println(arr[0]+", "+arr[1]+", "+arr[2]+", "+arr[3]);
    }

    //How to sort an ArrayList in Java 8?
    public static void sortAnArraylist(){
        List<String> list = Arrays.asList("Banana", "Papaya", "Apple");
        //Ascending Orer
        System.out.println("List is "+list);
        System.out.println(" Ascending Order "+list.stream().sorted().collect(Collectors.toList()));
        System.out.println(" Descending Order "+list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }

    //How to find the maximum and minimum in an ArrayList using Java 8?
    public static void findMaxandMin(){
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(1);

        //Find Max
        System.out.println("Max in "+list +" is "+list.stream().max(Integer::compareTo).orElseThrow());
        //Find Min
        System.out.println("Min in "+list +" is "+list.stream().min(Integer::compareTo).get());
    }

    //How to filter elements from an ArrayList in Java 8?
    public static void filterFromArrayList(){
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Tom");
        names.stream()
                .filter(name->name.startsWith("J",0))
                .forEach(System.out::println);
    }
}
