package Assign6;

// 22. to Copy one array into another

public class copyArray22 {
	public static void main(String[] args) {
        // Original array
        int[] originalArray = {10, 20, 30, 40, 50};
        
        // Create a new array of the same length
        int[] copiedArray = new int[originalArray.length];
        
        // Copy elements from originalArray to copiedArray
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }
        
        // Print the original array
       // System.out.println(originalArray);
        System.out.println("Original Array: ");
        for (int i = 0; i < originalArray.length; i++) {
			System.out.print(originalArray[i]+" ");
		}
//        for (int element : originalArray) {
//            System.out.print(element + " ");
//        }
        
        System.out.println("\nCopied Array: ");
        for (int i = 0; i < copiedArray.length; i++) {
			System.out.print(copiedArray[i]+" ");
		}
        
//        for (int element : copiedArray) {
//            System.out.print(element + " ");
//        }
        
        
        // loop given below coping and printing array together
//        System.out.println("method2");
//        for (int num : originalArray) {
//        	int i=0;
//            copiedArray[i]=num;
//            System.out.print(copiedArray[i]+" ");
//            i++;
//        }
    }

}
