package Assign6;

//15. WAP to demonstrate try catch block. 

public class TryCatchDemo15 {
	public static void main(String[] args) {
		
		try {
			int num1 =20;
			int num2=0;
			int result =num1/num2;
			System.out.println("result is: "+result);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Error block Excecuted");
			e.printStackTrace();
		}finally {
			System.out.println("Execution of try-catch block completed.");
		}
		
		
	}

}
