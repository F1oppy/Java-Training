package Data_Structure;

import java.util.*;

public class stack_ex {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Stack s = new Stack();
		
		System.out.println(s.isEmpty());
		
		s.push(85);
		s.push(55);
		s.push(75);
		s.push(35);
		s.push(75);
		s.push(65);
		
		System.out.println(s);
		System.out.println(s.isEmpty());
		
		s.pop();
		
		System.out.println(s);
		s.pop();
		
		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println(s.search(55));
		
		System.out.println(s.size());

		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
