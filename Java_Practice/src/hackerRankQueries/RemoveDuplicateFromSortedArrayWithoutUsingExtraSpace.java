package hackerRankQueries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromSortedArrayWithoutUsingExtraSpace {
    public static void main (String args[]){
        removeDuplicateFromSortedArrayWithout();
    }

    private static void removeDuplicateFromSortedArrayWithout() {
        Integer arr[] = {5,5,7,8,8,9,10,10,12,12,15,15,18};
        List<Integer> list = new ArrayList<>();
        int last = 0;
            for(int x = 0; x <arr.length;){
                for(int i = 1; i<arr.length;i++){
                    if(arr[x]==arr[i]){
                        continue;
                    }else{
                        x++;
                        arr[x]=arr[i];
                        last =x+1;
                        }
            }break;
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, last)));
    }
}
