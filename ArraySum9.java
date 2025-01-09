package Assign6;
//Q9: WAP to sum values of an array. 
import java.util.Scanner;

public class ArraySum9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of row");		
		int row=sc.nextInt();
		System.out.println("Enter number of col");
		int col=sc.nextInt();
	
		
		int [][] a = new int[row][col];
		int [][] b = new int[row][col];
		int [][] sum = new int[row][col];
		
		// take first array a
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				System.out.println("Enter a["+i+"]["+j+"]");
				
				 a[i][j]= sc.nextInt();
				// System.out.print(" "+a[i][j]);
				
			}
			//System.out.println();
			
		}
		
		//print array a
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				  System.out.print(" "+a[i][j]);
				
			}
			System.out.println();
			
		}
		
		// take second array b
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.println("Enter a["+i+"]["+j+"]");	
				 b[i][j]= sc.nextInt();
				 			
			}
					
		}
		
		// print array b
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				
				  System.out.print(" "+b[i][j]);
				
			}
			System.out.println();
			
		}
		
		// sum of a and b
		System.out.println("sum of array a and b is");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum[i][j]=a[i][j]+b[i][j];
				
				 System.out.print(" "+sum[i][j]);
				
			}
			System.out.println();
			
		}
		
	}

}
