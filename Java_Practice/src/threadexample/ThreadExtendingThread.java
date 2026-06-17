package threadexample;

import java.lang.Thread;

public class ThreadExtendingThread extends Thread {
    private String taskName;

    public ThreadExtendingThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        extendThreadExample();
    }

    private void extendThreadExample() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(taskName + " Extend Thread Count " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException ex) {
            System.err.println(taskName + " was interrupted.");
            Thread.currentThread().interrupt();
        }
    }
}
