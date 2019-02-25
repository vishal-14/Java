package multithreading;

/**
 * Return a Future from ExecutorService by using callable and use get(),
 * isDone(), isCancelled() with the Future object to know the status of task submitted
 * */

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        System.out.println("Thread starting: " + Thread.currentThread().getName());
        Future<Integer> futureOne;
        try {
            futureOne = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() {
                    try {
                        Thread.sleep(3000L);
                        System.out.println("Thread 1");
                    } catch (InterruptedException e) {
                        // e.printStackTrace();
                    }
                    return 10;
                }
            });
        } finally {
            executorService.shutdownNow();
        }
         futureOne.cancel(true);
        if (futureOne.isCancelled())
            System.out.println("Task was cancelled");
        if (futureOne.isDone())
            System.out.println("Value in Future object: " + futureOne.get().toString());

        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}