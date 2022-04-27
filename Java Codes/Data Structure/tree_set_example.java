package Data_Structure;

import java.util.*;

public class tree_set_example {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		//Unique elements, very fast// null is not allowed,maintains ascending order, not thhread safe

		TreeSet ts = new TreeSet();
		ts.add("Roxy");
		ts.add("Roxy");
		ts.add("Sandy");
		ts.add("Manish");
		ts.add("Pradeep");
		
		//ts.add(null;
		
		System.out.println(ts);
		
		Iterator i = ts.descendingIterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		TreeSet ts1 = new TreeSet();
		ts1.add(78);
		ts1.add(100);
		ts1.add(18);
		ts1.add(98);
		ts1.add(23);
		
		System.out.println(ts1);
		System.out.println("Lowest value: "+ts1.pollFirst());
		System.out.println("Highest value: "+ts1.pollLast());
		
	}
}
