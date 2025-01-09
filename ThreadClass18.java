package Assign6;

//18. WAP to create one thread by extending Thread class in another Class. 



class MyThread extends Thread{
	
	public void run() {
		System.out.println("MyThread excecuted...");
	}	
}


public class ThreadClass18 {
	public static void main(String[] args) {
		
		MyThread mt =new MyThread();
		mt.start();
		
		System.out.println("main Thread excecuted...");
	}

}
