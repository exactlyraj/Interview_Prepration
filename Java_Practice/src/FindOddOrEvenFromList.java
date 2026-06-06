import java.util.*;
import java. util.stream.*;

public class FindOddOrEvenFromList {
    public static void main(String args[]){
        findOddOrEvenFromList();
    }

   public static void  findOddOrEvenFromList(){
        List<Integer> list = List.of(1,2,3,4,5,6,7);
        list.stream().map(x-> x%2==0 ? x+" Is Even Number" : x+" Is Odd Number")
       .forEach(System.out::println);
   }
}
