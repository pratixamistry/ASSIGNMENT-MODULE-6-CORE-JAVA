package Assign6;

import java.util.Iterator;

/*
 * W.A.J.P to Print pattern Given Below. 

     (1) 
1 
12 
123 
1234 
12345 

 */

public class Pattern7 {
	public static void main(String[] args) {
		for (int i = 1; i <=5 ; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}
		
		
		
		for (int i = 1; i <=5 ; i++) {
			for (int j = i; j >=1; j--) {
				System.out.print(j);
			}
			System.out.println();
			
		}
		
		/*
		 *
		 (3) 
1 
01 
101 
01010 
101010 
		 */
		
		
		for (int i = 1; i <=5 ; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j%2);
			}
			System.out.println();
			
		}
		
		
		/*
		 ( 4) 
1 
2 2 
3 3 3 
4 4 4 4 

		 */
		for (int i = 1; i <=4 ; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i);
			}
			System.out.println();
			
		}
		
		/*
*  
* * * 
* * * * *  
* * * 
* 
		 */
		
		for (int i = 1; i <=3 ; i++) {
			for (int j = 1; j <=(2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for (int i = 2; i >=1 ; i--) {
			for (int j = 1; j <=(2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}

}
