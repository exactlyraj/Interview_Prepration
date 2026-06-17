package threadexample;

import java.util.concurrent.Callable;

public class ThreadImplementCallable implements Callable {
    private String taskName;

    public ThreadImplementCallable(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String call() {
        return callableThreadExample();
    }

    private String callableThreadExample() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(taskName + " Callable Count " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException ex) {
            System.err.println(taskName + " was interrupted.");
            Thread.currentThread().interrupt();
        }
        return "Callable thread Complete";
    }

}
