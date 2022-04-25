package Data_Structure;

import java.util.*;

public class LinkedList_remove {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		
		al.add("Anuj");
		al.add("Gaurav");
		al.add("Harsh");
		
		al.add("Virat");
		al.add("Gaurav");
		al.add("Harsh");
		al.add("Amit");
		
		System.out.println("Initial Linked List: " +al);
		
		al.remove("Vijay");
		
		System.out.println("Linked List After rmoving Vijay: " +al);
		
		al.remove(0);
		
		System.out.println("After removing 0th index Linked List: " +al);
		
		LinkedList<String> ll2= new LinkedList();
		ll2.add("Ravi");
		ll2.add("Hanumanth");
		al.add(ll2);
		
		System.out.println("Updated Linked List: "+al);
		
		al.removeFirst();
		System.out.println("After Removing First Linked List: "+al);
		
		al.removeLast();
		System.out.println("After Removing Last Linked List: "+al);
		
		al.removeFirstOccurrence("Gaurav");
		System.out.println("After Removing Last Linked List: "+al);
		
		al.removeLastOccurrence("Harsh");
		System.out.println("After Removing Last Linked List: "+al);
		
		Iterator i = al.descendingIterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
