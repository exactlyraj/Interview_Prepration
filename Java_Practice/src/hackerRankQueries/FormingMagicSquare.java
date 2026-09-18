package hackerRankQueries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FormingMagicSquare {
    public static void main(String args[]){
        List<List<Integer>> s= new ArrayList<>();
        s.add(Arrays.asList(5, 3, 4));
        s.add(Arrays.asList(1, 5, 8));
        s.add(Arrays.asList(6, 4, 2));
        formingMagicSquare(s);
    }

    private static void formingMagicSquare(List<List<Integer>> s) {

        for (int i = 0; i < s.size(); i++) {              // loop through rows
            System.out.println(s.get(i).size());
            for (int j = 0; j < s.get(i).size(); j++) {   // loop through columns
                int value = s.get(i).get(j);              // access element at (i, j)
                System.out.print(value + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}
