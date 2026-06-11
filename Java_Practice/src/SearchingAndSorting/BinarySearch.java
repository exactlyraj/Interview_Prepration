package SearchingAndSorting;
import java.util.List;
public class BinarySearch {
    public static void main(String args[]){
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
        int result = binarySearch(numbers,10);
        String response= result != -1 ? "Index of target is "+result : "Target Index not Found";
        System.out.println(response);
    }

    public static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid] < target){
                start = mid+ 1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
