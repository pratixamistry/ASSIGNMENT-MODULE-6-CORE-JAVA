package Assign6;
// Q4: W.A.J.P to check given number is Prime or not? 

import java.util.Scanner;

public class PrimeNumber4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

        // Check and display result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Negative numbers, 0 and 1 are not prime
        if (num <= 1) {
            return false;
        }

        // Check divisors from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
	}
	
		
	


