package Assign6;

import java.util.Iterator;

// 23. WAP to reverse an array of integer values

public class ArrayReverse23 {
	
	public static void main(String[] args) {
		
		int[] originalArray = {10, 20, 30, 40, 50};
		System.out.println("original Array is: ");
		for (int i = 0; i < originalArray.length; i++) {
			System.out.println(originalArray[i]);
		}
		int[] reverseArray = new int[originalArray.length];
		
		System.out.println("Reversed Array is: ");
		for (int num : originalArray) {
			
			int i=originalArray.length-1;
			System.out.println(reverseArray[i]=num);
			i--;
		}
	}

}
