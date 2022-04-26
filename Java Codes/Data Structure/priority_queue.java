package Data_Structure;

import java.util.*;

public class priority_queue {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		p.add("Amit");
		p.add("Vijay");
		p.add("Karan");
		p.add("Jai");
		p.add("Ram");
		p.add("Abdul");
		
		System.out.println("Head: "+p.element());
		System.out.println("Head: "+p.peek());
		
		Iterator i = p.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("After Removing: "+p);
		
		p.remove();		//Does not give null value if the  data is empty instead throws exception
		
		p.poll();  	//Does give null value if the data is empty
		
		System.out.println("After Removing: "+p);
		
	}
}
