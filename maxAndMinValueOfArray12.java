package Assign6;
//Q12: WAP to find the maximum and minimum value of an array. 

public class maxAndMinValueOfArray12 {
	public static void main(String[] args) {
        // Example 2D array
        int[][] arr = {
            {15, 2, 3},
            {4, 2, 6},
            {7, 8, 15}
        };

        // Initialize variables for min and max
        int min = arr[0][0];
        int max = arr[0][0];

        // Traverse the 2D array to find the min and max values
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        // Output the result
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

}
