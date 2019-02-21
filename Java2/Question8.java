//8. WAP to read words from the keyboard until the word done is entered. For each word except done, 
//report whether its first character is equal   to  its last character. For the required loop, use a 
//a)while statement 
//b)do-while statement
import java.util.Scanner;

public class Question8 {
    Scanner sc = new Scanner(System.in);
    // (i) with the help of while loop
    public void CharMatchWHile() {
        System.out.println("Enter any string");
        String word = sc.next();
        while (!word.equals("done")) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("First and last character are equal.");
            } else {
                System.out.println("First and last character are NOT equal.");
            }
            word = sc.next();
        }
    }
    // (ii) with the help of do-while loop
    public void CharMatchDoWhile()
    {
        System.out.println("Enter a word for Do while");
        String word1;
        do {
            word1 = sc.next();
            if (word1.charAt(0) == word1.charAt(word1.length() - 1)) {
                System.out.println("First and last character are equal.");
            } else {
                System.out.println("First and last character are NOT equal.");
            }
        }while (!word1.equals("done"));
    }

    public static void main(String[] args) {
        Question8 q= new Question8();
        q.CharMatchWHile();
        q.CharMatchDoWhile();

        }
}