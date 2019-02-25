package multithreading;

//Submit List of tasks to
//ExecutorService and wait for the completion of all the tasks

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultipleFutureDemo {
    public static void main(String[] args) throws InterruptedException {
        List<Callable<Integer>> callableList = new ArrayList<>();

        callableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(2000L);
                return 1;
            }
        });
        callableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(2000L);
                return 2;
            }
        });
        callableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(2000L);
                return 3;
            }
        });
        callableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(2000L);
                return 4;
            }
        });

        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        List<Future<Integer>> futureList = executorService.invokeAll(callableList);
        futureList.forEach((e) -> {
            if (e.isDone()) {
                try {
                    System.out.println("The Value is : " + e.get());
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                } catch (ExecutionException e1) {
                    e1.printStackTrace();
                }
            }
        });
        executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
        executorService.shutdown();


    }
}
