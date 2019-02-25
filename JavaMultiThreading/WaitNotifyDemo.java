package multithreading;

/*Coordinate 2 threads using wait() and notify().*/
public class WaitNotifyDemo {

    public void methodOne() {
        synchronized (this) {
            System.out.println("Method 1 Started");
            try {
                wait();
                System.out.println("Method 2 Ended--------------");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized public void methodTwo() {
        System.out.println("Method 2 Started");
        System.out.println("Method 2 Done*************");
        notify();
    }

    public static void main(String[] args) {
        WaitNotifyDemo waitNotifyDemo = new WaitNotifyDemo();
        new Thread(() -> {
            waitNotifyDemo.methodOne();
        }).start();
        new Thread(() -> {
            waitNotifyDemo.methodTwo();
        }).start();
    }
}
