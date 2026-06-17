public class FindFirstNonRepeatingCharacter {

    public static void main(String args[]){
        findFirstNonRepeatingCharecter();
        findFirstNonRepeatingCharecterWithemojiornon_printablecharacters();
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


    //codePoints() → processes full Unicode code points (handles emoji correctly).

    public static void findFirstNonRepeatingCharecterWithemojiornon_printablecharacters(){
        String input = "😊🚀Abhinav Kumar";
        System.out.println("Find first non-repeating character in string with emoji or non-printable characters "+input);
        String str= input.toLowerCase();
        Character result = str.codePoints().filter(ch->str.indexOf(ch)==str.lastIndexOf(ch))
                .mapToObj(nt-> (char) nt).
                findFirst().orElse(' ');
        System.out.println("First non-repeating character in string emoji or non-printable characters"+input+" is "+result);
    }
}
