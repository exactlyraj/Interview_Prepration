package threadexample;

import java.lang.Runnable;

public class ThreadImplementRunnable implements Runnable {

    private String taskName;

    ThreadImplementRunnable(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        runnableThreadExample();
    }


    private void runnableThreadExample() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(taskName + " Runnable Count " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException ex) {
            System.err.println(taskName + " was interrupted.");
            Thread.currentThread().interrupt();
        }
    }
}
