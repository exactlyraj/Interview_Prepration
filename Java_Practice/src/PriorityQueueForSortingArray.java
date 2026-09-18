import java.util.*;

public class PriorityQueueForSortingArray {
    public static void main(String args[]) {
        sorting();
        sortingUsingJava8();
        usingCollectioSort();

    }

    static class Nodes {
        int value, arrayIndex, elementIndex;

        Nodes(int value, int arrayIndex, int elementIndex) {
            this.value = value;
            this.arrayIndex = arrayIndex;
            this.elementIndex = elementIndex;
        }
    }

    public static void sorting() {
        int arrays[][] = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Nodes> minHeap = new PriorityQueue<>(Comparator.comparing(n -> n.value));
        //add first element to of each array
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length > 0) {
                minHeap.add(new Nodes(arrays[i][0], i, 0));
            }
        }
        while (!minHeap.isEmpty()) {
            Nodes node = minHeap.poll();
            result.add(node.value);

            //Insert next element from same array
            if (arrays[node.arrayIndex].length > node.elementIndex + 1) {
                minHeap.add(
                        new Nodes(arrays[node.arrayIndex][node.elementIndex + 1],
                                node.arrayIndex,
                                node.elementIndex + 1));
            }
        }
        System.out.println(result);


    }

    private static void sortingUsingJava8() {
        int arrays[][] = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[] array = Arrays.stream(arrays)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(array));
    }


    private static void usingCollectioSort() {
        int arrays[][] = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        List<Integer> list = new ArrayList<>();
        for (int arr[] : arrays) {
            for (int num : arr) {
                list.add(num);
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
