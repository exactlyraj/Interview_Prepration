public class FindFirstNonRepeatingCharacter {

    public static void main(String args[]){
        findFirstNonRepeatingCharecter();
    }

    public static void findFirstNonRepeatingCharecter(){
        String input = "Abhinav Kumar";
        System.out.println("Find first non-repeating character in "+input);
        String str= input.toLowerCase();
        Character result = str.chars().filter(ch->str.indexOf(ch)==str.lastIndexOf(ch))
                .mapToObj(nt-> (char) nt).
                findFirst().orElse(' ');
        System.out.println("First non-repeating character in "+input+" is "+result);
    }

}
