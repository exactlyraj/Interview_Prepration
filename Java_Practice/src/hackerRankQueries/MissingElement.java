package hackerRankQueries;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class MissingElement {
    public static void main(String args[]) {
        findMissingElement();
    }

    private static void findMissingElement() {
        int arr[] = {1, 2, 1, 3, 4, 2, 4, 5, 7, 7, 8, 9, 9, 8};
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        List<Integer> list = IntStream.rangeClosed(1, 9).filter(x -> !set.contains(x)).boxed().collect(Collectors.toList());
        System.out.println(list);
    }
}
