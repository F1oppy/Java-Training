package Data_Structure;

import java.util.*;

public class hash_set {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet();
		
		h.add("one");
		h.add("two");
		h.add("three");
		h.add("four");
		h.add("five");
		h.add("Five");
		h.add(null);
		
		System.out.println("HashSet: "+h);
		
		Iterator i = h.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Before Removing: "+h);
		
		h.remove("four");
		
		System.out.println("After Removing: "+h);
		
//		h.removeIf(str->str.contains("two"));
//		System.out.println("After Removing: "+h);
	}
}
