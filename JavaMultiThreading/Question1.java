/**
 * Question 1: Create and run a thread using Runnable interface and Thread class
 */
package multithreading;
class ExtendedThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread from Thread class: " + this.getName());
    }
}

class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread from Runnable interface: " + Thread.currentThread().getName());
    }
}

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Thread starting: " + Thread.currentThread().getName());
        Thread one = new Thread(new RunnableThread());
        Thread two = new ExtendedThread();
        one.start();
        two.start();
        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}