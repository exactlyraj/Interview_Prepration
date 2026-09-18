package SearchingAndSorting;
import java.util.*;
import java.util.stream.*;


public class MergeArrayAndSort {
    public static void main(String args[]){
        mergeAndSort();
    }

    private static void mergeAndSort() {
        int arr1[] ={1,5,10,15,20};
        int arr2[] = {3,8,12,18,25};
        int arr3[] = {2,4,6,7,29};

        System.out.println("Style One");
        //Style One
        int[] array = Stream.of(arr1, arr2, arr3)
                .flatMapToInt(Arrays::stream)
                .sorted().toArray();

        for (int arr : array){
            System.out.print(arr +",");
        }

        System.out.println("\nStyle Two");
        //Style Two
        int[] result = IntStream.concat(Arrays.stream(arr1), IntStream.concat(Arrays.stream(arr2), Arrays.stream(arr3))).toArray();
        Arrays.stream(result).sorted().forEach(x-> System.out.print(x+","));

        System.out.println("\nStyle Three");
        //Style Three
        Arrays.asList(arr1, arr2, arr3)
                .stream().flatMapToInt(Arrays::stream)
                .sorted().forEach(x-> System.out.print(x+","));

        System.out.println("\nStyle Four");
        //Style Four
        int mergeSortResult[] = mergeAndSortinjava7(arr1, arr2, arr3);
        System.out.println(Arrays.toString(mergeSortResult));
    }

    public static int[] mergeAndSortinjava7(int arr1[], int arr2[], int arr3[]){
        int result[] = new int[arr1.length+arr2.length+arr3.length];
        int i=0, j=0, k =0, r=0;
        while(i<arr1.length || j<arr2.length || k<arr3.length){
            int min = Integer.MAX_VALUE;
            if(i<arr1.length){
                min = Math.min(min, arr1[i]);
            }
            if(j<arr2.length){
                min = Math.min(min, arr2[j]);
            }
            if(k<arr3.length){
                min = Math.min(min, arr3[k]);
            }
            result[r++] = min;

            if(i<arr1.length && min == arr1[i]){
                i++;
            }else if(j<arr2.length && min == arr2[j]){
                j++;
            }else {
                k++;
            }

        }
        return result;
    }

    //*****************************************************//
    private static void prepration() {
        int arr1[] = {1, 5, 10, 15, 20};
        int arr2[] = {3, 8, 12, 18, 25};
        int arr3[] = {2, 4, 6, 7, 29};

        System.out.println("***********************FIRST APPROACH*******************\n");
        Object[] array = Stream.concat(Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()), Arrays.stream(arr3).boxed())
                .sorted().toArray();
        Arrays.stream(array).forEach(x -> System.out.print(x + ", "));

        System.out.println("\n***********************SECOND APPROACH*******************\n");

        Stream.of(arr1, arr2, arr3)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .forEach(x -> System.out.print(x + ", "));

        System.out.println("\n***********************THIRD APPROACH*******************\n");

        Integer arr4[] = {1, 5, 10, 15, 20};
        Integer arr5[] = {3, 8, 12, 18, 25};
        Integer arr6[] = {2, 4, 6, 7, 29};
        Stream.of(arr4, arr5, arr6)
                .flatMap(Arrays::stream)
                .sorted()
                .forEach(x -> System.out.print(x + ", "));


        System.out.println("\n***********************FOURTH APPROACH*******************\n");

        List<int[]> list = Arrays.asList(arr1, arr2, arr3);
        list.stream().flatMapToInt(Arrays::stream)
                .sorted().forEach(x -> System.out.print(x + ", "));


        System.out.println("\n***********************FIFTH APPROACH*******************\n");

        int[] result = merge(arr1, arr2, arr3);
        System.out.println(Arrays.toString(result));

        List<Integer> collect = Stream.of(arr1, arr2, arr3)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
        System.out.println(collect);

    }
    /*******************************************************/
    static int[] merge(int[] arr1, int[] arr2, int[] arr3) {
        int result[] = new int[arr1.length+arr2.length+arr3.length];
        int i = 0,j=0,k=0,r =0;
        while(i < arr1.length || j < arr2.length || k <arr3.length){
            int min = Integer.MAX_VALUE;
            if(i < arr1.length){
                min = Math.min(min, arr1[i]);
            }if(j < arr2.length){
                min = Math.min(min, arr2[j]);
            }if(k < arr3.length){
                min = Math.min(min, arr3[k]);
            }
            result[r++]=min;
            if(i < arr1.length && arr1[i]==min){
                i++;
            } else if (j < arr1.length && arr2[j]==min) {
                j++;
            }else {
                k++;
            }

        }

        return result;
    }
}
