package Data_Structure;

import java.util.*;

public class Array_List_method {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList al = new ArrayList();				
		
		System.out.println("Is Array List Empty: "+al.isEmpty());
		System.out.println("Array List Size: "+al.size());
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		System.out.println("After Add Method: "+al);
		System.out.println("Is Array List Empty: "+al.isEmpty());
		
		al.add(1,"Gaurav");
		System.out.println("After adding First Index: "+al);
		
		ArrayList al2 = new ArrayList();	
		al2.add("Sonoo");
		al2.add("Hanumanth");
		
		al.addAll(al2);
		System.out.println("After adding 1st Index: "+al);
		
		ArrayList al3 = new ArrayList();
		al3.add("Water");
		al3.add("Papaya");
		
		al.addAll(1, al3);
		System.out.println("After adding list on 1st index: "+al);
		
		System.out.println("Array Size: "+al.size());
		
		Collections.sort(al);
		System.out.println("Sorted Ascending Order Array: "+al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Sorted Descending Order Array: "+al);
		
	}
}
