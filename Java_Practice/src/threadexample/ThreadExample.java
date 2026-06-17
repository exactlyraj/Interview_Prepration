package threadexample;

// Java 7 Thread Example
public class ThreadExample {

    // Approach 1: Extending the Thread class
    static class MyThread extends Thread {
        private String taskName;

        public MyThread(String taskName) {
            this.taskName = taskName;
        }

        @Override
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(taskName + " - Count: " + i);
                    Thread.sleep(500); // Simulate work
                }
            } catch (InterruptedException e) {
                System.err.println(taskName + " was interrupted.");
                Thread.currentThread().interrupt(); // Restore interrupt status
            }
        }
    }

    // Approach 2: Implementing the Runnable interface
    static class MyRunnable implements Runnable {
        private String taskName;

        public MyRunnable(String taskName) {
            this.taskName = taskName;
        }

        @Override
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(taskName + " - Count: " + i);
                    Thread.sleep(500); // Simulate work
                }
            } catch (InterruptedException e) {
                System.err.println(taskName + " was interrupted.");
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        // Create threads using both approaches
        Thread t1 = new MyThread("Thread-1");
        Thread t2 = new Thread(new MyRunnable("Thread-2"));

        // Start threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted.");
            Thread.currentThread().interrupt();
        }

        System.out.println("All threads have finished execution.");
    }
}