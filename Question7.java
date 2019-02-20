//Q7. Write a program to print your Firstname,LastName & age
// using static block,static method & static variable respectively

public class Question7 {
    static String firstName;             //Static variable
    static String lastName;
    static int age;

    static {                            //Static block
        firstName = "Vishal";
        lastName = "Aggarwal";
        age = 22;
    }

    public static void main(String[] args) {    //Static method

        System.out.println("First Name : "+firstName+"\nLast Name : "+lastName);
        System.out.println("Age : "+age);
    }
}
