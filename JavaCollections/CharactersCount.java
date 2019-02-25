package collections;
/**Write a method that takes a string and print the number of
  *occurrence of each character characters in the string.
  **/
import java.util.HashMap;
import java.util.Scanner;

public class CharactersCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String inputString = sc.nextLine();
        System.out.println("Character Count in String Are:" );
        System.out.println(getCharacterCount(inputString));
    }

    private static HashMap<Character, Integer> getCharacterCount(String inputString) {
        char[] strings = inputString.toCharArray();  //Considering Lowercase and uppercase as different characters
                                                     //for same case we can add toLowerCase
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : strings) {
            Integer occurrence = map.getOrDefault(c, 0);
            if(c!=' ')
            map.put(c, occurrence + 1);
        }
        return map;
    }
}
