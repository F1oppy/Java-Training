package Data_Structure;

import java.util.*;

public class Vector_ex {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Aditya");
		v.add(69.69);
		v.add("Jaipur");
		v.add("BioTechnology");
		v.add(650000);
		
		System.out.println("Vector is: "+v);
		
		v.remove(1);
		System.out.println("Vector is: "+v);
	}
	
}
