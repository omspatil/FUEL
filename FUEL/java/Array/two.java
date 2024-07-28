package Array;
//WAP for 3 rows and 4 col with the help of array concept
//      rows ->  [11, 12, 13, 14] 
//      [15, 16, 17, 18]
//      [19, 20, 21, 22]

public class two {
    public static void main(String[] args) {
        // Define the values
        int[][] array = {
            {11, 12, 13, 14},
            {15, 16, 17, 18},
            {19, 20, 21, 22}
        };
        
        // Display the array
        System.out.println("Array with 3 rows and 4 columns:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
