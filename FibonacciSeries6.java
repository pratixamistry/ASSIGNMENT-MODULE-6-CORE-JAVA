package Assign6;

// Q6: W.A.J.P for create Fibonacci Series
import java.util.Scanner;

public class FibonacciSeries6 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter howmany numbers of fibonacci series to be prnted");
		int num =sc.nextInt();
		
		
		int digit1=0;
		int digit2=1;
		int next=0;
		System.out.println();
		
		for (int i = 1; i <=num; i++) {
			
			if (i==1) {
				System.out.println(digit1);
			}
			
			if (i==2) {
				System.out.println(digit2);
			}
			
			if (i>=3) {
				next=digit1+digit2;
				System.out.println(next);
				digit1=digit2;
				digit2=next;
				
			}
			
			
			
		}
		
	}

}
