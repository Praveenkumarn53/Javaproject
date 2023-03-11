package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"John","Smith","Leena","Priya"};
		
		System.out.println("The second name is "  + names[1]);
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("John");
		list1.add("Smith");
		list1.add("Leena");
		list1.add("kumar");
		list1.add("priya");
		//list1.add(null);

		System.out.println("The list is " + list1);
		System.out.println("The size of the list is " + list1.size());
		System.out.println("First Name in the list is " + list1.get(0));
		System.out.println("Last Name in the list is " + list1.get(list1.size()-1));

		// To add a new string in between
		list1.add(3, "Ashw");
		System.out.println("The list added new after Leena" + list1);
		
		// to update the list (Smith is updated to Mike).
		
		list1.set(1, "Mike");
		System.out.println("The list after updated Smith and new name is" + list1);

		//list1.remove(3);
		//System.out.println("The list after deleting index 3 " + list1);
		
		
		// iterate through the list
		
		for(int i=0;i<list1.size();i++) {
			System.out.println("Element name" + list1.get(i));
		}
		
		for(String value:list1) {
			
			System.out.println("Elemt value " + value);
			
		}
			
		Iterator<String> itr = list1.iterator();
		
		while(itr.hasNext()) {
			
		System.out.println(itr.next());
			
		}
		
		// Would Reverse list but will not sort list 
		Collections.reverse(list1);
		System.out.println(" Reverse the list"+list1);

		Collections.sort(list1);
		System.out.println("After sorting the list"+list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("After sorting in descending order"+list1);
	}
	
	
	
}

