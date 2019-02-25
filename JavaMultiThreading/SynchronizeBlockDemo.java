package multithreading;

/**Use Synchronize block to enable synchronization between
 * multiple threads trying to access method at same time.*/

public class SynchronizeBlockDemo {
    private int counter;

    public void incrementCounter() {
        synchronized (this) {
            counter++;
        }
    }

    public void methodOne() {
        for (int i = 0; i < 1000; i++)
            incrementCounter();
    }

    public void methodTwo() {
        for (int i = 0; i < 1000; i++)
            incrementCounter();
    }

    public static void main(String[] args) throws InterruptedException {

        SynchronizeBlockDemo synchronizeBlockDemo = new SynchronizeBlockDemo();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizeBlockDemo.methodOne();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizeBlockDemo.methodTwo();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
        thread1.start();
        thread1.join();

        System.out.println("Counter is : " + synchronizeBlockDemo.counter);

    }
}