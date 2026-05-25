public class SwapTwoNumbers
{
    public static void main(String args[]){
        swapTwoNumbers();
    }

    public static void swapTwoNumbers(){
        System.out.println("Swap two Number Without using third variable");
        int a = 74, b = 65;
        System.out.println("Before Swapping, value of a = "+a+ " and value of b is "+b) ;
        a = a-b;
        b = b+a;
        a = b-a;
        System.out.println("After  Swapping, value of a = "+a+ " and value of b is "+b) ;
    }
}
