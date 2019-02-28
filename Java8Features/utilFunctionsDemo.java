package javaEight;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 5.
 Implement following functional interfaces from java.util.function using lambdas:

 (1) Consumer

 (2) Supplier

 (3) Predicate

 (4) Function


 */

public class utilFunctionsDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer= e-> System.out.println("Consumer Lambda "+ e);
        consumer.accept(4);

        Supplier<Integer> supplier= ()->22;
        System.out.println("Supllier Lambda "+supplier.get());

        Predicate<Integer> predicate=e->e%2==0;
        System.out.println("Predicate Lambda: Even number or not(arg:66): "+ predicate.test(66));

        Function<Integer,Integer> function=e->e*3;
        System.out.println("Function Lambda: "+function.apply(3));
    }
}
