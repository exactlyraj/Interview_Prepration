import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CheckVowelPresentorNot {
    public static void main(String args[]) {
        //checkVowelIsPresentorNot();
        reverseStringandRemoveVowels();
    }

    public static void checkVowelIsPresentorNot() {
        String input = "Abhinav Kumar";
        System.out.println("Check vowel is present or not in string " + input);
        boolean result = input.matches(".*[aeiou].*");
        System.out.println("Vowel is present in string " + input + " " + result);

    }

    public static void reverseStringandRemoveVowels() {
        //Reverse the String and remove the vowels from It.
        //Input: String name = "divya";
        //Output: yvd
        String name = "Divya";
        StringBuilder sb = new StringBuilder(name).reverse();
        System.out.println(sb.toString().replaceAll("[aeiouAEIOU]", ""));

        System.out.println("\n One more way");

        Arrays.stream(sb.toString().split("")).filter(ch -> !"AEIOUaeiou".contains(ch))
                .forEach(x -> System.out.print(x));


        System.out.println("\n Another more way ");

        String result = new StringBuilder(
                name.chars()
                        .mapToObj(c -> (char) c)
                        .filter(ch -> "aeiouAEIOU".indexOf(ch) == -1)
                        .map(String::valueOf)
                        .collect(java.util.stream.Collectors.joining())

        )
                .reverse()
                .toString();
        System.out.println("result:" + result);



        Arrays.stream(name.split(""))
                .filter(x-> "aeiouAEIOU".indexOf(x)==-1)
                .collect(Collectors.toList()).reversed()
                .forEach(x-> System.out.print(x+", "))
        ;



    }


}

