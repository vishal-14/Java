package collections;

/**
 * Design a data structure SpecialStack that supports all
 * the stack operations like push(), pop(), isEmpty(), and an
 * additional operation getMin() which should return minimum element from
 * the SpecialStack. (Expected complexity ­ O(1))
 */

import java.util.Stack;

public class SpecialStackDemo extends Stack<Integer> {
    private Stack<Integer> minStack = new Stack<Integer>();

    public void push(int element) {

        if (isEmpty()) {
            super.push(element);
            minStack.push(element);
        } else {
            super.push(element);
            int minEle = minStack.peek();
            if (element < minEle)
                minStack.push(element);
            else
                minStack.push(minEle);
        }
    }

    public Integer pop() {
        Integer poppedElement = null;
        if (!isEmpty())
            poppedElement = super.pop();
        if (minStack.isEmpty() == false)
            minStack.pop();
        return poppedElement;
    }

    public Integer getMin() {
        if (isEmpty())
            return null;
        return minStack.peek();
    }

    public static void main(String[] args) {
        SpecialStackDemo specialStack = new SpecialStackDemo();
        System.out.println("Pushing elements onto stack:");
        specialStack.push(8);
        specialStack.push(19);
        specialStack.push(5);
        specialStack.push(9);
        specialStack.push(10);
        if (specialStack.getMin() != null)
            System.out.println("Minimum element " + specialStack.getMin());
        System.out.println("\nPopping elements from stack:");
        System.out.println(specialStack.pop());
        System.out.println(specialStack.pop());
        System.out.println(specialStack.pop());
        specialStack.push(15);
        specialStack.push(2);
        System.out.println("Is stack empty? " + specialStack.isEmpty());
        System.out.println("Minimum element " + specialStack.getMin());
    }
}
