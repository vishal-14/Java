//Q6. There is an array with every element repeated twice except one.
// Find that element

import java.util.Arrays;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int[] arr = new int[size];    // size of array
        System.out.println("Enter the elements in the array ");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();  // initializing elements of array
        }

        Arrays.sort(arr);   // sorting of element

        int []stack = new int[size];
        int top=-1;
        for (int i=0;i<size;i++){
            if(top==-1){
                stack[++top] = arr[i];
            }
            else if(stack[top]==arr[i]){
                top--;
            }
            else
                stack[++top] = arr[i];
        }
        System.out.println("Unique element is: ");
        System.out.println(stack[top]);   // printing the element
    }
}
