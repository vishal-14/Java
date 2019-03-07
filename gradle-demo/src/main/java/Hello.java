import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class Hello extends Welcome {

    private List list = Arrays.asList("hello!", "How", "aRe", "yoU");

    void convertToCapital() {
        System.out.println("Using StringUtils class ...");
        System.out.println("List before swapCase: " + list.toString());
        System.out.println("List after swapCase: " + StringUtils.swapCase(list.toString()));
    }

    public static void main(String[] args) {

        Hello hello = new Hello();
        hello.convertToCapital();


    }
}