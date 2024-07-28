package Array;
//write a program for find the duplicate a array

//int [] b={20,40,60,20,30,50,40};

public class three {
    public static void main(String[] args) {
        int[] b = { 20, 40, 60, 20, 30, 50, 40 };
        findDuplicates(b);
    }

    // Method to find duplicate elements in an array
    public static void findDuplicates(int[] arr) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element has occurred before
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element found: " + arr[i]);
                    break; // Once a duplicate is found, break out of the inner loop
                }
            }
        }
    }

}