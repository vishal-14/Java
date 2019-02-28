package javaEight;

/**
 * 6.Create and access default and static method of an interface.
 */
interface defaultDemo{
    static void display(){
        System.out.println("I am static method");
    }
    default void print()
    {
        System.out.println("I am default method");
    }
}
public class DefaultMethodDemo implements defaultDemo {
    public static void main(String[] args) {
        defaultDemo.display();
        new DefaultMethodDemo().print();
    }
}
