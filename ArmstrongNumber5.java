package Assign6;

import java.lang.classfile.instruction.ReturnInstruction;

//Q5: W.A.J.P to check given number is Armstrong or not? 

import java.util.Scanner;

public class ArmstrongNumber5 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the number");
		int num= sc.nextInt();
		
		//System.out.println(isarmstrong(num));
		
		if (isarmstrong(num)) {
			System.out.println(num + " number is an armstrong number");
			
		} else {
			System.out.println(num + " number is not an armstrong number");

		}
		
		
	}
	
	

	public static  boolean isarmstrong(int number) {
		
		int digits=String.valueOf(number).length();
		double result=0;
		int originalnumber= number;
				
				while (number!=0) {
					int digit=number%10;
					
					result= result+Math.pow(digit, digits);
					number=number/10;
				}
				
				return result == originalnumber ;
				
				//System.out.println(return result == originalnumber);
	}
}

