package Data_Structure;	

import java.util.*;

public class hash_set_methods {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Ravi");
		hs.add("Vijay");
		hs.add("Arun");
		hs.add("Sumit");
		
		System.out.println("Updated HashSet: "+hs);
		
		hs.remove("Ravi");
		System.out.println("Before Removing: "+hs);
		
		HashSet<String> hs1 = new HashSet<String>();
		
		hs1.add("Ajay");
		hs1.add("Gaurav");
		
		hs.addAll(hs1);
		
		System.out.println("After adding all set: "+hs);
		
		hs.removeAll(hs1);
		System.out.println("After removing hs1: "+hs);
		
		hs.removeIf(str->str.contains("Vijay"));
		System.out.println("After Removing Ajay From Set: "+hs);
		
		hs.clear();
		System.out.println("After Clearing: "+hs);
	}
}
