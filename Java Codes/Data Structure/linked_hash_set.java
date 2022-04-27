package Data_Structure;

import java.util.*;

public class linked_hash_set {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		//it contains unique values, null values allowed, not thread safe, made in the insertion order
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("one");
		lhs.add("two");
		lhs.add("three");
		lhs.add("four");
		lhs.add("five");
		lhs.add("five");
		lhs.add(null);
		
		System.out.println("Updated Linked HashSet: "+lhs);
		

		Iterator i = lhs.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Before Removing: "+lhs);
		
		lhs.remove("five");
		
		System.out.println("After Removing: "+lhs);
	}
}