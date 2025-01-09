package Assign6;
import java.util.Scanner;
//Q1: W.A.J.P to Take three numbers from the user and print the greatest number. 

public class GreatestNumber1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		// taking inputs
		
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		System.out.println("Enter third number");
		int num3 = sc.nextInt();
		
		int greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }

        // Print the result
        System.out.println("The greatest number is: " + greatest);
	}

}
