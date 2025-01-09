package Assign6;
//Q14: WAP to concatenate a given string to the end of another string.
import java.util.Scanner;

public class concanateString14 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Input the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Concatenate the strings
        String result = firstString + secondString;

        // Display the result
        System.out.println("Concatenated String: " + result);

        scanner.close();
    }
}
