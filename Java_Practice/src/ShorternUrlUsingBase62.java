import java.util.*;
public class ShorternUrlUsingBase62 {
    public static void main (String args[]){
        shorternUrlUsingBase62();
        decodeBase62();
    }


    public static void shorternUrlUsingBase62(){
        String BASE62 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String url="https://localhost:8080/api";
        Long id = 125l;
        StringBuilder sb = new StringBuilder();
        while(id>0){
        sb.append(BASE62.charAt((int)(id%62)));
        id = id/62;
        }
        System.out.println(sb.reverse().toString());
    }


    public static void decodeBase62(){
        String BASE62 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String code = "cb";
        Long id=0l;
        for(int i = 0; i < code.length();i++){
            int index = BASE62.indexOf(code.charAt(i));
            System.out.println(index);
            id = id*62 +index;
        }
        System.out.println(id);
    }

}
