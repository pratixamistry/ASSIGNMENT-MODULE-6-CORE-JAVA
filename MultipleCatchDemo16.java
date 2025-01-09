package Assign6;

// 16. WAP to demonstrate multiple catch blocks 

public class MultipleCatchDemo16 {
	public static void main(String[] args) {
		try {
            // Code that may throw exceptions
            int[] numbers = {1, 2, 3};
            int result = numbers[5] / 0; // Will throw ArrayIndexOutOfBoundsException
        } 
        // Catch block for ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");
        } 
        // Catch block for ArithmeticException
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } 
        // Generic catch block for any other exceptions
        catch (Exception e) {
            System.out.println("Error: Some other exception occurred!");
        } 
        finally {
            // This block always executes
            System.out.println("Execution completed.");
        }
	}

}
