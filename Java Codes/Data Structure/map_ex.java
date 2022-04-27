package Data_Structure;

import java.util.*;

public class map_ex {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		// just like dictionary in python, used to store values in keys
		Map m = new HashMap();
		m.put(1, "Amit");
		m.put(2, "Rahul");
		m.put(3, "Jai");
		m.put(4, "Amit");
		
		Set s = m.entrySet();
		
		Iterator i = s.iterator();
		
		while(i.hasNext()){
			Map.Entry entry = (Map.Entry)i.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
