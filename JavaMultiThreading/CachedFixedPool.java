package multithreading;

/**Increase concurrency with Thread pools using newCachedThreadPool()
 * and newFixedThreadPool().
 * */


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Process implements Runnable {

    private int processId;

    public Process(int processId) {
        this.processId = processId;
    }

    @Override
    public void run() {
        System.out.println("Thread name::" + Thread.currentThread().getName() + " Start : " + processId);
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread name::" + Thread.currentThread().getName() + " End : " + processId);
    }
}


public class CachedFixedPool {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 12; i++) {
            executorService.submit(new Process(i));
        }
        executorService.shutdown();
    }
}