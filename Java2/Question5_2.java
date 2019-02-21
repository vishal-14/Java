//5. WAP to show object cloning in java using copy constructor.
class Example {
    int n;

    Example(int n){
        this.n = n;
    }

    Example(Example e){
        System.out.println("Copy Constructor Called!");
        n = e.n;
    }

}
public class Question5_2{
    public static void main(String[] args) {
        Example e1 = new Example(10);
        Example e2 = new Example(e1);
        System.out.println("Value of e2.n: " + e2.n);
    }
}