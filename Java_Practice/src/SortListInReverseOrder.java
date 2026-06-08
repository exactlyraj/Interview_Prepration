import java.util.*;
import java.util.stream.Collectors;

public class SortListInReverseOrder {
    public static void main(String args[]){
        sortListInReverseOrder();
    }

    private static void sortListInReverseOrder() {
        List<Integer> list = List.of(12,43,6,98,7,0,8,9,6,88,6);
       System.out.println(
                list.stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder()).collect(Collectors.toList())
       );
    }
}
