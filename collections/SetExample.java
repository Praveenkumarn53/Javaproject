package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		HashSet<String> set1 = new HashSet<String>();

		set1.add("Jake");
		set1.add("Lily");
		set1.add("Jake");
		set1.add("Tony");
		set1.add(null);

		System.out.println("The set is " + set1);
		
		TreeSet<String> Set2=new TreeSet<String>();
		
		Set2.add("Zen");
		Set2.add("Ben");
		Set2.add("Zen");
		Set2.add("Kane");
		
		System.out.println("The set is " + Set2);
		
		//convert set to list.
		ArrayList<String> list1 = new ArrayList<String>(set1);
		System.out.println(Set2);

	}

}