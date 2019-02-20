// Q8. Write a program to reverse a string and remove character
// from index 4 to index 9 from the reversed string using String Buffer

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string ");
        String string = sc.next();
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer = stringBuffer.reverse();    //Reversing the element
        stringBuffer = stringBuffer.delete(4,10);  //Removing element from index 4 to 9.
        System.out.println(stringBuffer);
    }
}
