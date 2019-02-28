package javaEight;

/**
 * 7.Override the default method of the interface.
 */
interface defaultMethodOverride{
    default void display()
    {
        System.out.println("Display method in interface");
    }
}
public class DefaultMethodOverride implements defaultMethodOverride{
    @Override
    public void display() {
        System.out.println("Display method Overridden");
    }

    public static void main(String[] args) {
        DefaultMethodOverride obj= new DefaultMethodOverride();
        obj.display();
    }
}
