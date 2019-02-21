//4. WAP to create singleton class.
class Singleton
{
    private static Singleton single_instance = null;

    public int n;

    private Singleton() {
        n = 50;
    }

    public static Singleton getInstance() {
        if (single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }
}
public class Question4 {
    public static void main(String args[]) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1.n);
        System.out.println(instance2.n);
        instance1.n=25;
        System.out.println(instance1.n);
        System.out.println(instance2.n);
    }
}
