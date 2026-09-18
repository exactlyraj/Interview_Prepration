package hackerRankQueries;

import java.util.Arrays;

public class KeyboardAndDriver {

    public static void main(String args[]) {
        KeyboardAndDriver();
    }

    private static void KeyboardAndDriver() {

        int[] keyboards = {3, 7, 4, 6, 2, 5};
        int[] drives = {7, 9, 7};
        int b = 951;

        int max = -1;
        int total = 0;

        System.out.println("\nJava 7 ***********************First APPROACH*******************\n");

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                total = keyboards[i] + drives[j];
                if (total > max && total <= b) {
                    max = total;
                }
            }
        }
        System.out.println(max);


        System.out.println("\nJava Sream ***********************SECOND APPROACH*******************\n");
        System.out.println(
                Arrays.stream(keyboards).flatMap(k -> Arrays.stream(drives).map(d -> k + d))
                        .filter(t -> t <= b)
                        .max()
                        .orElse(-1)

        );
    }
}
