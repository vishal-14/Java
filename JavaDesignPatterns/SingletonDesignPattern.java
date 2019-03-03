package com.designpattern;

/**
 * 1.Implement Singleton Design Pattern on a dummy class.
 */
class SingletonExample {
    private static SingletonExample singletonInstance = null;

    private SingletonExample() {
        // private constructor helps to restrict the instantiation
        // Here the code for DBconnection, logging or caching can be given
    }

    public static SingletonExample getSingletonInstance() {
        if (null == singletonInstance) {
            singletonInstance = new SingletonExample();
            System.out.println("New instance Created");
        }
        return singletonInstance;
    }

    public void printSingleton() {
        System.out.println("Referring to same object now");
    }
}

public class SingletonDesignPattern {
    public static void main(String[] args) {
        SingletonExample obj = SingletonExample.getSingletonInstance();

        SingletonExample.getSingletonInstance().printSingleton();
        SingletonExample.getSingletonInstance().printSingleton();
    }
}
