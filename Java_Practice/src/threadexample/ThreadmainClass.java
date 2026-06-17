package threadexample;

public class ThreadmainClass {
    public static void main(String args[]) {
        Thread runablethread = new Thread(new ThreadImplementRunnable("Runnable Thread1"));
        runablethread.start();

        Thread extendthread = new Thread(new ThreadExtendingThread("Extend Thread1"));
        extendthread.start();
        System.out.println("Main thread: " + Thread.currentThread().getName());

        // Using lambda (Java 8+)
        Thread t3 = new Thread(() -> {
            System.out.println("Lambda thread running: " + Thread.currentThread().getName());
        });
        t3.start();

        try {
            // Wait for both threads to finish
            runablethread.join();
            extendthread.join();
            t3.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted.");
            Thread.currentThread().interrupt();
        }
    }
}
