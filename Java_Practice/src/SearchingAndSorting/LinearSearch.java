package SearchingAndSorting;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12, 13},
                {14,15, 16, 17},
                {18,19, 20}};
        int target = 6;
        linearSearch(arr, target);
    }

    private static void linearSearch(int[][] arr, int target) {
        if(arr==null){
            throw new NullPointerException("Input is null");
        }
        for (int row =0; row< arr.length;row++){
            for(int collumn =0; collumn <arr[row].length;collumn++){
                if(arr[row][collumn]==target){
                    System.out.println(row +""+ collumn);
                    break;
                }
            }
        }

    }
}
