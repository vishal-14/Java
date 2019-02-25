package multithreading;

/*Coordinate mulitple threads using wait() and notifyAll()*/


public class WaitAndNotifyAllDemo {

    public void methodOne() {
        synchronized (this) {
            System.out.println("Worker 1 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("------------Worker 1 Done------------");
        }
    }

    public void methodTwo() {
        synchronized (this) {
            System.out.println("Worker 2 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("-----------Worker 2 Done----------");
        }
    }

    public void methodThree() {
        synchronized (this) {
            System.out.println("Worker 3 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("----------Worker 3 Done---------");
        }
    }


    public void methodFour() {
        synchronized (this) {
            System.out.println("Worker 4 Started");
            System.out.println("--------Worker 4 Done----------");
            notifyAll();
        }
    }

    public static void main(String[] args) {
        WaitAndNotifyAllDemo waitAndNotifyAllDemo = new WaitAndNotifyAllDemo();
        new Thread(() -> {
            waitAndNotifyAllDemo.methodOne();
        }).start();
        new Thread(() -> {
            waitAndNotifyAllDemo.methodTwo();
        }).start();
        new Thread(() -> {
            waitAndNotifyAllDemo.methodThree();
        }).start();
        new Thread(() -> {
            waitAndNotifyAllDemo.methodFour();
        }).start();
    }
}

