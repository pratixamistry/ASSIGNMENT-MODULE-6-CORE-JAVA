package Assign6;

import java.util.Scanner;
//Q13: WAP to Compare Two String

public class compareString13 {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter the first string
//        System.out.print("Enter the first string: ");
//        String string1 = scanner.nextLine();
//
//        // Prompt the user to enter the second string
//        System.out.print("Enter the second string: ");
//        String string2 = scanner.nextLine();
        
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";
        
        // Using equals() to compare strings
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are equal.");
        } else {
            System.out.println("str1 and str2 are not equal.");
        }
        
        if (str1.equals(str3)) {
            System.out.println("str1 and str3 are equal.");
        } else {
            System.out.println("str1 and str3 are not equal.");
        }
        
        String str11 = "Hello";
        String str21 = "World";
        
        // Using compareTo() to compare strings lexicographically
        int result = str11.compareTo(str21);
        
        if (result == 0) {
            System.out.println("str11 and str21 are equal.");
        } else if (result < 0) {
            System.out.println("str11 is lexicographically less than str21.");
        } else {
            System.out.println("str11 is lexicographically greater than str21.");
        }
	}

}
