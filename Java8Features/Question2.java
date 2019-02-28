package javaEight;

/**
 * 2. Create a functional interface whose method takes 2 integers and return one integer.
 */
interface interfc{
    int operation(int a,int b);
}
public class Question2 {
    public static void main(String[] args) {
        interfc itr=(a,b)-> (a+b);
        System.out.println("Sum is : "+itr.operation(4,5));
    }
}
