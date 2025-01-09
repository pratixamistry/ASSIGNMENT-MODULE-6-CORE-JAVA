package Assign6;
import java.awt.geom.Arc2D.Double;
import java.util.Scanner;
// Q10: WAP to calculate the average value of array elements.

public class AvgofArray10 {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of row");		
		int row=sc.nextInt();
		
		System.out.println("Enter number of col");		
		int col=sc.nextInt();
				
		int [][] a = new int[row][col];
		
		// take array elements
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				System.out.println("Enter a["+i+"]["+j+"]");
				
				 a[i][j]= sc.nextInt();
								
			}
						
		}
		
		//print array a
		System.out.println("array a is");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				  System.out.print(" "+a[i][j]);
				
			}
			System.out.println();
			
		}
		
		//average of array a
		int sum =0;
		int len = row*col;
		double avg;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				   sum =sum + a[i][j];
				
			}
			
		}
		
		avg = (double) sum/len;
		System.out.println("sum is: "+sum);
		System.out.println("average of array a is"+ avg);


	}

}
