package Data_Structure;

import java.util.*;

public class linked_map_ex {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		LinkedHashMap m1 = new LinkedHashMap();
		m1.put(1, "Amit");
		m1.put(2, "Rahul");
		m1.put(3, "Jai");
		m1.put(4, "Amit");
		
		Set s1 = m1.entrySet();
		
		Iterator i = s1.iterator();
		
		while(i.hasNext()){
			Map.Entry entry = (Map.Entry)i.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
