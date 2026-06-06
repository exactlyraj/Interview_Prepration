import java.util.*;

public class FindSubArrayWithTarget {

    public static void main(String args[]){
        FindSubArrayWithTarget();
    }


    public static void FindSubArrayWithTarget(){
        int arr[] = {2,3,1,3,3};
        int target = 6;
        int sum=0;
        int left=0;

        List<Integer> list = new ArrayList<>();
        for(int right =0; right<arr.length;right++){
            sum = sum + arr[right];
            while(sum>=target && right<arr.length-1 ){
                list.remove(Integer.valueOf(arr[left])) ;
                sum = sum-arr[left];
                left++;
            }

            list.add(arr[right]);

        }
        System.out.println(list);
    }
}
