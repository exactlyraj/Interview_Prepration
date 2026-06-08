import java.util.*;
public class FindtheLongestSubstringWithoutRepeatingCharacters {
    public static void main(String args[]){
        findtheLongestSubstringWithoutRepeatingCharacters();
    }

    public static void findtheLongestSubstringWithoutRepeatingCharacters(){
        String str = "abcAbcbb";
        str = str.toLowerCase();
        Set<Character> set = new LinkedHashSet<>();
        int left = 0;
        int maxlength=0;
        int start = 0;

        for(int right = 0; right< str.length(); right ++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            if(right - left + 1 > maxlength){
                maxlength = right - left + 1;
                start = left;
            }
        }
        System.out.println(str.substring(start, maxlength+start));

    }
}
