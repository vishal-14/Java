package javaEight;

/**
 * 1. Write the following a functional interface and implement it using lambda:
 * (1) First number is greater than second number or not      Parameter (int ,int ) Return boolean
 * (2) Increment the number by 1 and return incremented value Parameter (int) Return int
 * (3) Concatenation of 2 string                              Parameter (String , String ) Return (String)
 * (4) Convert a string to uppercase and return .             Parameter (String) Return (String)
 */
@FunctionalInterface
interface A {
    boolean greaterThan(int a, int b);
}

@FunctionalInterface
interface B {
    int increment(int a);
}

@FunctionalInterface
interface C {
    String concat(String str1, String str2);
}

@FunctionalInterface
interface D{
    String upper(String str);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        A q1 = (a, b) -> a > b ? true : false;
        System.out.println("First number greater than second(agr:16,5): " + q1.greaterThan(16, 5));

        B q2 = a -> a + 1;
        System.out.println("Increment in the number by 1(arg:7): " + q2.increment(7));

        C q3 = (a,b) -> a.concat(b);
        System.out.println("Concatenation of two strings(arg:'abc' 'def'): "+q3.concat("abc","def"));

        D q4 = a-> a.toUpperCase();
        System.out.println("String in upper case(arg:'vishal'): "+q4.upper("vishal"));
    }
}
