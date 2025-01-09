package Assign6;

public class Demo {
	
	public static void main(String[] args) {
        // Define a 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Element to search for
        int target = 9;

        // Call the method to find the index
        int[] result = findElementIndex(array, target);

        // Print the result
        if (result != null) {
            System.out.println("Element found at: Row " + result[0] + ", Column " + result[1]);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int[] findElementIndex(int[][] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return new int[]{i, j}; // Return the row and column as an array
                }
            }
        }
        return null; // Return null if the element is not found
    }

}
