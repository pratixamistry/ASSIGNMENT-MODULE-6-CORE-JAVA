package Assign6;

//Q8: WAP to compute the sum of the first 100 prime numbers. 

public class SumFIrst100PrimeNumber8 {
	public static void main(String[] args) {
        int count = 0;
        int number = 2; // Start checking for primes from 2
        int sum = 0;

        while (count < 100) {
            if (isPrime(number)) {
                sum += number;
                count++;
            }
            number++;
        }

        System.out.println("The sum of the first 100 prime numbers is: " + sum);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
    	
        if (n < 2) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(n); i++) {
        	
// Only check up to the square root of n
            if (n % i == 0) return false;
            
        }
        
        return true;
    }

}
