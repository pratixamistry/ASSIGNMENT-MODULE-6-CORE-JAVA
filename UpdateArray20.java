package Assign6;

public class UpdateArray20 {
	public static void main(String[] args) {
        // Sample array
        int[] numbers = {10, 20, 30, 40, 50};

        // Index to update and the new value
        int indexToUpdate = 2; // For example, we want to update the third element
        int newValue = 99;

        // Update the element if the index is valid
        if (indexToUpdate >= 0 && indexToUpdate < numbers.length) {
            numbers[indexToUpdate] = newValue;
            System.out.println("Array updated successfully.");
        } else {
            System.out.println("Invalid index. No update performed.");
        }

        // Print the updated array
        System.out.println("Updated array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

}
