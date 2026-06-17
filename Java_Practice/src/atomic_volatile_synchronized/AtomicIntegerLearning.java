package atomic_volatile_synchronized;

import java.util.concurrent.atomic.AtomicInteger;


public class AtomicIntegerLearning {

    public static void main(String args[]){
        atomicIntegerLearning();
    }
    public static void atomicIntegerLearning(){
        AtomicInteger atomicInteger = new AtomicInteger(1);//Initial Value is 1

        int incrementAndGet = atomicInteger.incrementAndGet();
        System.out.println("Increment and get the Latest incrementAndGet "+incrementAndGet);

        int initialValue = atomicInteger.get();
        System.out.println("Get the Latest initialValue "+initialValue);

        int decrementAndGet = atomicInteger.decrementAndGet();
        System.out.println("Get the Latest decrementAndGet "+decrementAndGet);

        int addAndGet = atomicInteger.addAndGet(2);
        System.out.println("Get the Latest addAndGet "+addAndGet);

        int compareAndExchange = atomicInteger.compareAndExchange(3,4);
        System.out.println("Get the Latest compareAndExchange "+compareAndExchange);

        boolean compareAndSet = atomicInteger.compareAndSet(4,6);
        System.out.println("Get the Latest compareAndSet "+compareAndSet);

        int latestValue = atomicInteger.get();
        System.out.println("Get the Latest latestValue "+latestValue);
    }
}
