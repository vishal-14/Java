// Q3. Write a program to find the number of occurrences
// of a character in a string without using loop?
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string ");
        String str = sc.next();
        System.out.println("Enter the character ");
        String removedChar = sc.next();
        String str1 = str.replaceAll(removedChar,"");
        System.out.println("The number of occurences of "+removedChar+" are "+ (str.length()-str1.length()));
    }
}
