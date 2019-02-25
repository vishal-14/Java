package collections;
/**Write Java code to define List . Insert 5 floating point numbers in List,
 * and using an iterator, find the sum of the numbers in List.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {


    public static void main(String[] args) {
        float sum = 0.0f;
        List<Float> values = new ArrayList<>();
        values.add(4.5f);
        values.add(12.3f);
        values.add(7.2f);
        values.add(1.7f);
        values.add(8.0f);

        Iterator<Float> floatIterator = values.iterator();
        while (floatIterator.hasNext()) {
            sum += floatIterator.next();
        }

        System.out.println("Sum of List is : " + sum);
    }

}
