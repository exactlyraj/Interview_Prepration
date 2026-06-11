package hackerRankQueries;
import java.util.List;
import java.util.stream.*;
public class BonAppetit {
    public static void main(String args[]){
        bonAppetit(List.of(3,10,2,9),1,12);
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int anna = (bill.stream().reduce(Integer::sum).get()-bill.get(k))/2;
        String value = anna==b ? "Bon Appetit":(b-anna)+"";
        System.out.println(value);
    }
}
