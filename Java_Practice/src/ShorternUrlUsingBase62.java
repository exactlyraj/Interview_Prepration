import java.util.*;
public class ShorternUrlUsingBase62 {
    public static void main (String args[]){
        shorternUrlUsingBase62(125L);
        decodeBase62("cb");
    }


    public static String shorternUrlUsingBase62(Long id){
        String BASE62 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String url="https://localhost:8080/api";
        StringBuilder sb = new StringBuilder();
        while(id>0){
        sb.append(BASE62.charAt((int)(id%62)));
        id = id/62;
        }
        System.out.println(sb.reverse().toString());
        return sb.reverse().toString();
    }


    public static void decodeBase62(String code){
        String BASE62 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Long id=0L;
        for(int i = 0; i < code.length();i++){
            int index = BASE62.indexOf(code.charAt(i));
            System.out.println(index);
            id = id*62 +index;
        }
        System.out.println(id);
    }

}
