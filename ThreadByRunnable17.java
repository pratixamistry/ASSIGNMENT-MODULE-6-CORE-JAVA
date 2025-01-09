package Assign6;
// 17. WAP to create one thread by implementing Runnable interface in Class.

// class implementing runnable interface

class myrunnable implements Runnable{
	
	//
	public void run() {
		for (int i = 0; i <= 10; i++) {
		System.out.println("thread is Running"+  i+  "time");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
}

public class ThreadByRunnable17 {
	public static void main(String[] args) {
		
		//creating instance 
		myrunnable  ab = new myrunnable();
		
		Thread thread =new Thread(ab);
		thread.start(); // to start the thread
		
 System.out.println("thread is done");
	}
	
}
