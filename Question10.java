//Q10.Write a single program for following operation using overloading

public class Question10 {

    // A) Adding 2 integer number
    private static void add(int a, int b){
        System.out.println("Addition of ints " + (a+b));
    }

    //  B) Adding 2 double
    private static void add(double a, double b){
        System.out.println("Addition of doubles " + (a+b));
    }

    // C) multiplying 2 float
    private static void multiply(float a, float b){
        System.out.println("Multiplication of floats "+a*b);
    }

    // D) multiplying 2 int
    private static void multiply(int a, int b){
        System.out.println("Multiplication of ints "+a*b);
    }

    // E) concate 2 string
    private static void concatString(String str, String str1)
    {
        str.concat(str1);
        System.out.println("Concatenation of two strings "+str);
    }

    // F) Concate 3 String
    private  static void concatString(String str1, String str2, String str3){
        String str= new String("");
        str= str.concat(str1).concat(str2).concat(str3);
        System.out.println("Concatenation of Three strings "+str);

    }
    public static void main(String[] args) {

        add(2,3);
        add(3.5,4.5);
        multiply(2,3);
        multiply(3.2f,2.3f);
        concatString("str", "str1");
        concatString("first","second","third");

    }
}
