import java.util.Arrays;
import java.util.Comparator;


public class MaxandMin {
    public static void main(String args[]){
        maxandMin();
    }

    private static void maxandMin() {
        Integer arr[] = {12,1,23,5,4,3,6,53};
        //Top 3 minimum
        System.out.println("Min top 3 from list ");
        Arrays.stream(arr).sorted().limit(3)
                .forEach(x-> System.out.print(x+","));

        System.out.println("\n\n"+"Max top 3 from list ");

        //Top 3 maximum
        Arrays.stream(arr).sorted(Comparator.reverseOrder()).limit(3)
                .forEach(x-> System.out.print(x+","));




    }
}
