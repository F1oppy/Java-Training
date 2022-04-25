package Data_Structure;

import java.util.*;

public class LinkedList_ex {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();				//Non Generic list type
		
		list.add(101);
		list.add("Books");
		list.add(1999.0);
		list.add(101);
		list.add("Books");
		list.add(1999.0);
		
		System.out.println(list);
		
		System.out.println(list);
		
		list.set(4, "Fruits");
		
		System.out.println(list);
		
		Iterator itr= list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList<String> al = new ArrayList<String>(); 	//Generic Type List(Only 1 datatype)
		
		al.add("Mango");
		al.add("Orange");
		al.add("Grape");
		al.add("Apple");
		al.add("Kiwi");
		
		Collections.sort(al);
		
		System.out.println(al);
		
		for (String s : al){
			System.out.println(s);
		}
	}
}
