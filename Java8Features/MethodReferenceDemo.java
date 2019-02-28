package javaEight;

/**
 * 3.Using (instance) Method reference create and apply add and subtract method
 * and using (Static) Method reference create and apply multiplication method
 * for the functional interface created.
 */
@FunctionalInterface
interface interf
{
    int operation(int a,int b);
}
public class MethodReferenceDemo {
    int add(int a,int b)
    {
        return a+b;
    }
    int sub(int a,int b)
    {
        return a-b;
    }
    static int mul(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args) {
        interf itr= new MethodReferenceDemo()::add;
        System.out.println("Sum "+itr.operation(4,5));

        interf itr1= new MethodReferenceDemo()::sub;
        System.out.println("Subtraction "+itr1.operation(6,3));

        interf itr2 = MethodReferenceDemo::mul;
        System.out.println("Multiplication "+itr2.operation(5,6));

    }
}
