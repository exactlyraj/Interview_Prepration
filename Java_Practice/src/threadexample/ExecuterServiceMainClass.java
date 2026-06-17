package threadexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterServiceMainClass {
    public static void main(String args[]){
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        //.execute is for runnable and it will not return anything.
        executorService.execute(new ThreadExtendingThread("Executer Extend Thread 1"));
        executorService.execute(new ThreadImplementRunnable("Executer Runnable Thread 1"));

        //.submit is For Callable which will return status of task
        Future<String> futureResult =  executorService.submit(new ThreadImplementCallable("Executer Callable Thread 1"));
        System.out.println("Responce of Callable Service "+futureResult);//It will show task not completed at this time.
        try {
            String result = futureResult.get(); // Blocks until task completes
            System.out.println("Callable Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //For GraceFully Shutdown.
        executorService.shutdown();
    }
}
