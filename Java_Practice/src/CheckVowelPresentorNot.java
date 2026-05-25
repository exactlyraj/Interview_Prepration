public class CheckVowelPresentorNot {
    public static void main(String args[]){
        checkVowelIsPresentorNot();
    }

    public static void checkVowelIsPresentorNot(){
        String input = "Abhinav Kumar";
        System.out.println("Check vowel is present or not in string "+input);
        boolean result = input.matches(".*[aeiou].*");
        System.out.println("Vowel is present in string "+input+ " " +result);

    }
}
