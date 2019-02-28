package javaEight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 10.Sum all the numbers greater than 5 in the integer list.
 */
public class Question10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Sum of elements greater than 5 is " + list.stream()
                .filter(e -> e > 5)
                .collect(Collectors.summingInt(e -> e)));
    }
}
