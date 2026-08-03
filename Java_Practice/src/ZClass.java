import java.util.Arrays;

import java.util.stream.Collectors;
import java.util.function.*;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ZClass {
    public static void main(String args[]){
        prepration();
    }

    private static void prepration() {
        int arr1[] ={1,5,10,15,20};
        int arr2[] = {3,8,12,18,25};
        int arr3[] = {2,4,6,7,29};
        Object[] array = Stream.concat(Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()), Arrays.stream(arr3).boxed())
                .sorted().toArray();
        Arrays.stream(array).forEach(x->System.out.print(x+", "));

        System.out.println();

        Stream.of(arr1, arr2, arr3)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .forEach(x->System.out.print(x+", "));

        System.out.println();

        Integer arr4[] ={1,5,10,15,20};
        Integer arr5[] = {3,8,12,18,25};
        Integer arr6[] = {2,4,6,7,29};
        Stream.of(arr4,arr5,arr6)
                .flatMap(Arrays::stream)
                .sorted()
                .forEach(x-> System.out.print(x+", "));

  }





}
