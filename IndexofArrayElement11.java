package Assign6;
import java.security.PublicKey;
// WAP to find the index of an array element. 
import java.util.Scanner;

public class IndexofArrayElement11 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number of row");		
		int row=sc.nextInt();
		System.out.println("Enter number of col");
		int col=sc.nextInt();
			
		int [][] array = new int[row][col];
		
		// take first an array 
				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[i].length; j++) {
						
						System.out.println("Enter a["+i+"]["+j+"]");
						
						 array[i][j]= sc.nextInt();										
					}								
				}
				
				//print an array 			
				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[i].length; j++) {
						
						  System.out.print(" "+array[i][j]);						
					}
					System.out.println();					
				}
				
				// element to search for
				System.out.println("Enter the element to search for");
				int target = sc.nextInt();
				
				for (int i = 0; i < array.length; i++) {
		            for (int j = 0; j < array[i].length; j++) {
		                if (array[i][j] == target) {
		                    System.out.println("Element found at row"+i+", column"+j);
		                }
		            }
		        }
				
//				int[] result = findElementIndex(array,target);
//				// Print the result
//		        if (result != null) {
//		            System.out.println("Element found at: Row " + result[0] + ", Column " + result[1]);
//		        } else {
//		            System.out.println("Element not found in the array.");
//		        }
				
	}
//				public static int[] findElementIndex(int[][] array, int target) {
//			        for (int i = 0; i < array.length; i++) {
//			            for (int j = 0; j < array[i].length; j++) {
//			                if (array[i][j] == target) {
//			                    return new int[]{i, j}; // Return the row and column as an array
//			                }
//			            }
//			        }
//			        return null; // Return null if the element is not found
//			    }
	}


