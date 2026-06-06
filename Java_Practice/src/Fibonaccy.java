public class Fibonaccy {
    public static void main(String args[]){
        fibonaccySeries();
    }

    public static void fibonaccySeries(){
        int start = 0;
        int first = 1;
        int number = 8;
        for(int i = 0; i< number; i ++){
            System.out.print(start+" ");
            int temp = start+first;
            start = first;
            first = temp;
        }
    }
}
