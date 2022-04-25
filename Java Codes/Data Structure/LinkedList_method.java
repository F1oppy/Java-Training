package Data_Structure;

import java.util.*;
import java.util.Collections;

public class LinkedList_method {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList al = new LinkedList();				
		
		System.out.println("Is Linked List Empty: "+al.isEmpty());
		System.out.println("Array List Size: "+al.size());
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		System.out.println("After Add Method: "+al);
		System.out.println("Is Linked List Empty: "+al.isEmpty());
		
		al.add(1,"Gaurav");
		System.out.println("After adding First Index: "+al);
		
		LinkedList al2 = new LinkedList();	
		al2.add("Sonoo");
		al2.add("Hanumanth");
		
		al.addAll(al2);
		System.out.println("After adding 1st Index: "+al);
		
		LinkedList al3 = new LinkedList();
		al3.add("Rahul");
		al3.add("John");
		
		al.addAll(1, al3);
		System.out.println("After adding list on 1st index: "+al);
		
		al.addFirst("Lokesh");
		System.out.println("After adding in First: "+al);
		
		al.addLast("Harsh");
		System.out.println("After adding in Last: "+al);
		
		System.out.println("Array Size: "+al.size());
		
		Collections.sort(al);
		System.out.println("Sorted Ascending Order List: "+al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Sorted Descending Order List: "+al);
	}
}
