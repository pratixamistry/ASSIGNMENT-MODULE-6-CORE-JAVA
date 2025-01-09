package Assign6;
import java.util.Scanner;
public class PrimeNumber8 {
	
	

	public class PrimeCheck {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
//	        if (isPrime(number)) {
//	            System.out.println(number + " is a prime number.");
//	        } else {
//	            System.out.println(number + " is not a prime number.");
//	        }
//	        
//	        //scanner.close();
    }
	    
	   // System.out.println("2nd method");

	    public static boolean isPrime(int n) {
	        // Handle edge cases
	        if (n <= 1) {
	            return false; // Numbers <= 1 are not prime
	        }
	        if (n == 2) {
	            return true; // 2 is the smallest prime number
	        }
	        if (n % 2 == 0) {
	            return false; // Even numbers greater than 2 are not prime
	        }
	        
	        // Check divisors up to √n
	        for (int i = 3; i <= Math.sqrt(n); i += 2) {
	            if (n % i == 0) {
	                return false; // Found a divisor
	            }
	        }
	        return true; // No divisors found, n is prime
	    }
	}

}
