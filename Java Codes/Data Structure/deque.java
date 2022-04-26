package Data_Structure;

import java.util.*;

public class deque {
	public static void main(String[] args) {
		Deque<String> d = new ArrayDeque<String>();
		
		d.add("Ravi");
		d.add("Vijay");
		d.add("Ajay");
		
		for(String s:d) {
			System.out.println(s);
			}
			
		d.offerFirst("Jai");
		d.offerLast("Kalai");
		
		System.out.println("After adding First and Last:");
		
		for(String s:d) {
			System.out.println(s);
			}
		
		d.pollFirst();
		d.pollLast();
		
		System.out.println("After Deleting First and Last:");
		
		for(String s:d) {
			System.out.println(s);
			}
	}
}
