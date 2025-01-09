package Assign6;

//25. Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 
//'message' that prints "This is first subclass" and "This is second subclass" respectively. 
//Call the methods 'message' by creating an object for each subclass. 

abstract class Parent{
	abstract void message();
}

class FisrtSubClass extends Parent{
	public void message() {
		System.out.println("This is First sub Class...");
	}
}

class SecondSubClass extends Parent{
	public void message() {
		System.out.println("This is Second sub Class...");
	}
}
public class SubClass25 {
	public static void main(String[] args) {
		
		FisrtSubClass first = new FisrtSubClass();
		SecondSubClass second = new SecondSubClass();
		
		first.message();
		second.message();
	}

}
