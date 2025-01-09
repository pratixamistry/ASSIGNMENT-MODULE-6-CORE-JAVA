package Assign6;

import java.util.Scanner;

/* 26. to create a custom exception if Customer withdraw amount which is greater than account balance then program will show custom exception otherwise amount will deduct from account balance. 

Account balance is:2000 Enter withdraw amount:2500 
Sorry, insufficient balance, you need more 500 Rs.To perform this transaction.
*/

class InsufficientbalanceException extends Exception{
	double amount;
	
	public InsufficientbalanceException(double amount) {
		this.amount= amount;
		System.out.println("Sorry, insufficient balance, you need more" +amount+ "Rs"
				+ " to perform this transaction");
	}
}

class ATM{
	
	double balance=2000;
	public void withdraw(double amount) throws InsufficientbalanceException,ArithmeticException {
		
		if (amount<balance) {
			balance= balance-amount;
			System.out.println("amount withdrawn: "+amount+ "Rs "+"your account balance is: "
			+ balance+"Rs");
		}else {
			double needs=amount-balance;
			throw new InsufficientbalanceException(needs);
		}
	}
}

public class Exception26 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn");
		double amount=sc.nextDouble();
		
		ATM atm =new ATM();
		try {
			atm.withdraw(amount);
			
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InsufficientbalanceException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
//			System.out.println("Sorry, insufficient balance, you need more" + e.amount+ "Rs"
//					+ " to perform this transaction");
		}		
	}
}
