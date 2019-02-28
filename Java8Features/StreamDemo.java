package javaEight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 9. Collect all the even numbers from an integer list.
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list1 = list.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Original List: "+list);
        System.out.println("Even numbers List: "+list1);
    }
}
