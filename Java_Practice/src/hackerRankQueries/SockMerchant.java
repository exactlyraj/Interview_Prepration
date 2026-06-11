package hackerRankQueries;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class SockMerchant {
    public static void main(String args[]){
       int numberofpairs = sockMerchant(15,List.of(6,5,2,3,5,2,2,1,1,5,1,3,3,3,5));
       System.out.println("Number of Pairs = "+numberofpairs);
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer,Long> map = ar.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
        int li = map.values().stream()
                .mapToInt(count-> (int) (count/2)).reduce(Integer::sum).getAsInt();
        return li;
    }
}
