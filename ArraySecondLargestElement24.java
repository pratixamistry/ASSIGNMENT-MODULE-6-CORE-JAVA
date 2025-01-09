package Assign6;
// 24. to find the second largest element in an array. 

public class ArraySecondLargestElement24 {
	public static void main(String[] args) {
		
		int[] array = {30, -20, 0, 10, -60};
		int largest =Integer.MIN_VALUE;
		int SecondLargest= Integer.MIN_VALUE;
		int index = 0;
		
		
		if (array.length==1) {
			System.out.println("Erray must have minimum two elements");
		}
		
		//loop to find the greatest element of array
			if(array.length>=2) {		
			
		for (int i = 0; i < array.length; i++) {
			
			int num2 =array[i];
			
			if (num2>largest) {
				largest =num2;
				}			
			}
		System.out.println("Largest number is: "+largest);
	}
	
			// loop to remove greatest number from the array
			int j=0;
			int[] array2 =new int[array.length-1];
			
			for (int i = 0; i < array.length; i++) {
				if (i!=index) {
					
					array2[j]=array[i];					
					// System.err.println(i);
					j++;
				}				
			}
		
	// loop to find the Second largest element		
			for (int i = 0; i < array2.length; i++) {
				
				int num2 =array2[i];
				
				if (num2>SecondLargest) {
					SecondLargest=num2;					
				}				
				}			
			System.out.println("Second Largest nember is: "+SecondLargest);		
		}
	}
	
	
