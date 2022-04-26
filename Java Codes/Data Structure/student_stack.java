package Data_Structure;

import java.util.*;

public class student_stack{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Stack s1 = new Stack();
		
		System.out.println(s1.isEmpty());
		
		s1.push("Aditya");
		s1.push("Biotechnology");
		s1.push(23);
		s1.push(01);
		s1.push(650000);
		s1.push(8109571658f);
		
		System.out.println(s1);
		System.out.println(s1.isEmpty());
		
		s1.pop();
		
		System.out.println(s1);
		s1.pop();
		
		System.out.println(s1);
		
		System.out.println(s1.peek());
		
		System.out.println(s1.search("Aditya"));
		
		System.out.println(s1.size());

		Iterator i = s1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
