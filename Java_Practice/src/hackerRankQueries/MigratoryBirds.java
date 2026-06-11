package hackerRankQueries;
import jdk.jfr.Frequency;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class MigratoryBirds {
    public static void main(String args[]){
        List<Integer> listofBirds = List.of(1,4,4,4,5,3);
        int response = migratoryBirds(listofBirds);
        System.out.println("Frequently sighted type "+response);
    }

    private static int migratoryBirds(List<Integer> listofBirds) {

       Map<Integer,Long> map = listofBirds.stream()
               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        Long maxValue = map.values().stream().max(Long::compareTo).get();
        System.out.println(maxValue);

        Integer minkey = map.entrySet().stream().filter(mp-> mp.getValue()==maxValue)
                .map(x-> x.getKey()).min(Integer::compareTo).get();

        return minkey;
    }
}
