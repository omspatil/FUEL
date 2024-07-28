package Array;

// write a program to sort the array .
// int []a={10,50,90,60,20,30};
import java.util.Arrays;

public class one {
    public static void main(String[] args) {
        int[] a = { 10, 50, 90, 60, 20, 30 };

        System.out.println("Original Array:");
        printArray(a);

        Arrays.sort(a); // Sorting the array

        System.out.println("\nSorted Array:");
        printArray(a);
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
