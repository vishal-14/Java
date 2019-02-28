/**
 * 12.Find the first even number in the integer list which is greater than 3.
 */
package javaEight;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Question12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> optionalInteger= list.stream()
                .filter(e->e>3)
                .filter(e->e%2==0)
                .findFirst();
        System.out.println("First even number greater than 3 is " + optionalInteger.get());
    }
}
