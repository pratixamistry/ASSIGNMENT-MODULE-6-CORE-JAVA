package Assign6;
//Q3:  W.A.J.P to find factorial for Given Number.
import java.util.Scanner;


public class Factorial3 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int fact_number = sc.nextInt();
		int a= fact_number;
		int a1=a;
		//System.out.println(a);
		
		while (a>1) {
			fact_number= fact_number*(a-1);
			//System.out.println("fact number" +fact_number);
			a--;
			
		}
		
		System.out.println("factorial of" +a1+ "is" +fact_number);
		
	}

}
