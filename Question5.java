//Q5. Find common elements between two arrays.

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array ");
        int size1 = sc.nextInt(); //Size of array 1
        int arr[] = new int[size1];
        System.out.println("Enter the elements in the first array ");
        for (int i=0;i<size1;i++)
            arr[i] = sc.nextInt(); //Intializing element in array 1
        System.out.println("Enter the size of the second array ");
        int size2 = sc.nextInt(); // Size of array 2
        int[] arr1 = new int[size2];
        System.out.println("Enter the elements in the second array ");
        for (int i=0;i<size2;i++)
            arr1[i] = sc.nextInt(); //Intializing element in array 2
        System.out.println("Common elements are: ");
        for (int i=0;i<size1;i++){
            for (int j=0;j<size2;j++){
                if (arr[i]==arr1[j]){ //comparing elements
                    System.out.println(arr[i]); //printing the common elements
                    break;
                }
            }
        }
    }
}
