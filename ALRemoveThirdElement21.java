package Assign6;
//21. to remove the third element from a array list. 

import java.util.ArrayList;

public class ALRemoveThirdElement21 {
	public static void main(String[] args) {
		
		ArrayList array = new ArrayList();
		array.add("Pratixa");
		array.add(35);
		array.add(100);
		array.add('J');
		array.add(19.34f);
		array.add(new Integer (70));
		
		System.out.println(array);
		
		array.remove(2);
		System.out.println("3rd element has been removed");
		System.out.println(array);
	}

}
