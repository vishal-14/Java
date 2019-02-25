package multithreading;

/*Use Atomic Classes instead of Synchronize method and blocks.*/

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClassDemo {


    AtomicInteger counter = new AtomicInteger();

    public void incrementCount() {
        synchronized (this) {
            counter.incrementAndGet();
        }
    }

    public void methodOne() {
        for (int i = 1; i <= 1000; i++) {
            counter.incrementAndGet();
        }
    }

    public void methodTwo() {
        for (int i = 1; i <= 1000; i++) {
            counter.incrementAndGet();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        AtomicClassDemo atomicClassDemo = new AtomicClassDemo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                atomicClassDemo.methodOne();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                atomicClassDemo.methodTwo();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Counter by Atomic Class : "+ atomicClassDemo.counter);
    }

}
