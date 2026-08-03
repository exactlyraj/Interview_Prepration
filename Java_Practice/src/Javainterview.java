import java.net.StandardSocketOptions;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Javainterview {

    public static void main(String args[]) {
        //String s= "abcaabbcc" output: a1b1c1a2b2c2
        //stringmodification("abcabc");

        //String s="password" output:word
        //stringsubString("password");

        findduplicate();
    }

    private static void stringsubString(String password) {
        System.out.println(password.substring(4));
    }


    private static void stringmodification(String str) {
        String res = "";
        if (!str.isBlank()) {
            int count = 1;

            for (int i = 0; i < str.length(); i++) {
                if (i == 3) {
                    count++;
                }
                res = res + str.charAt(i) + count;
            }

        }
        System.out.println(res);
    }

    public static void findduplicate(){
        List<Integer>  list = List.of(1,3,2,4,5,6,4,3,2,2);
        //list.stream().distinct().filter(count-> Collections.frequency(list,count)>1).forEach(System.out::println);
        Map<Integer, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        collect.entrySet().stream()
                .filter(x-> x.getValue()>1)
                .forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));


    }

}
