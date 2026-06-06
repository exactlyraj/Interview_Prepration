import java.util.*;
import java. util.stream.*;

public class RemoveDuplicatesfromaList {
    public static void main(String args[]){
        removeDuplicatesfromaList();
    }

    public static void removeDuplicatesfromaList(){
        List<Integer> list =  List.of(1,2,2,3,4,3,4,6,7,8);
        System.out.println(list.stream().distinct().collect(Collectors.toList()));
    }

}

