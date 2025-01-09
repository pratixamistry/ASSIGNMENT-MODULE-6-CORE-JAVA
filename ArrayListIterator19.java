package Assign6;

import java.util.ArrayList;
import java.util.Iterator;

// 19. WAP to iterate through all elements in an array list. 

public class ArrayListIterator19 {
	public static void main(String[] args) {
		
		ArrayList array = new ArrayList();
		array.add("Pratixa");
		array.add(35);
		array.add('J');
		array.add(19.34f);
		array.add(new Integer (70));
		
		
		
		Iterator iterator =array.iterator(); 
			
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			
		};
	}

}
