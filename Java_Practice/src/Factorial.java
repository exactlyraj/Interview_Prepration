import java.util.stream.*;
public class Factorial {

    public static void main(String args[]){
        factorial();
        factorialjava7();
    }

    public static void factorial(){
        IntStream.rangeClosed(1,10).reduce((x,y)-> x*y).ifPresent(System.out::println);
    }

    public static void factorialjava7(){
        int start =1;
        int number = 10;

        int fact = 1;
        for(int i =1; i<=number; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
