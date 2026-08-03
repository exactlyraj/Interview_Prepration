package SearchingAndSorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedArrays {
    public static void main(String args[]) {
        mergeKSortedArrays();
    }

    static class Node {
        int value, arrayIndex, elementIndex;
        Node(int value, int arrayIndex, int elementIndex) {
            this.value = value;
            this.arrayIndex = arrayIndex;
            this.elementIndex = elementIndex;

        }
    }

    private static void mergeKSortedArrays() {
        int[][] arrays = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(n -> n.value));

        // Initialize heap with first element of each array
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length > 0) {
                minHeap.add(new Node(arrays[i][0], i, 0));
            }
        }

        while (!minHeap.isEmpty()) {
            Node node = minHeap.poll();
            result.add(node.value);

            // Insert next element from the same array
            if (node.elementIndex + 1 < arrays[node.arrayIndex].length) {
                minHeap.add(new Node(
                        arrays[node.arrayIndex][node.elementIndex + 1],
                        node.arrayIndex,
                        node.elementIndex + 1
                ));
            }
        }
        System.out.println(result);


    }
}
