package collections;

/*Write a method that takes a string and returns the number of
unique characters in the string.*/

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.lang.*;

public class UniqueCharacters {
    private static int getCharacters(String inputString) {
        char[] strings = inputString.toLowerCase().toCharArray();// toLowerCase to make the uppercase and
                                                                 //lowercase as same characters.
        Set<Character> set = new HashSet<>();
        for (char c : strings) {
            if(c!=' ')
            set.add(c);
        }
        return set.size();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String inputString = sc.nextLine();
        System.out.println("Number Of Unique Characters In String Are : " + getCharacters(inputString));
    }
}
