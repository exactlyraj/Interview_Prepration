import java.math.BigInteger;

public class CheckNumberisPrimeOrNot {
    public static void main(String args[]){
        checkNumberisPrimeOrNot(1000000000000000003L);
        checkNumberisPrimeOrNot(new BigInteger("1000000000000000003"));
    }

    //If a number divided by 1 and itself that is prime number.
    private static void checkNumberisPrimeOrNot(Long number) {
        boolean isPrime = true;
        if(number >1){
            long counter =2;
            while(counter < number){
                if(number % counter ==0){
                    isPrime = false;
                    System.out.println(counter);
                    break;
                }
                counter++;
            }
            if(isPrime){
                System.out.println("Number is prime Number");
            }else{
                System.out.println("Number is NOT Prime Number");
            }
        }else{
            System.out.println("Not a valid number");
        }

    }

    //If a number divided by 1 and itself that is prime number.
    private static void checkNumberisPrimeOrNot(BigInteger number) {
       System.out.println(number.isProbablePrime(1000000000));
    }

}
