/**
 * 11.Find average of the number inside integer list after doubling it.
 */
package javaEight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Average of list after doubling the elements is " + list.stream()
                .map(e -> e * 2)
                .collect(Collectors.averagingInt(e -> e)));
    }
}
