public class FindReverseString {
    public static void main(String args[]){
        findReverseString();
    }

    public static void findReverseString(){
        String input = "Kanak";
        String str = input.toLowerCase();
        System.out.println("Check given String is reversed or not" + str);
        StringBuilder sb = new StringBuilder(str.toLowerCase()).reverse();
        String result = sb.toString().equals(str)? str+" is reverse string": str+" is NOT reverse string";
        System.out.println(result);
    }
}
