package jdk8_Features;

import java.util.*;

public class lambda_using_foreach {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("Ankit");
		list.add("Anu");
		list.add("Pooja");
		list.add("Sangeeta");
		list.add("Amritha");
		
		list.forEach(
				(n)->System.out.println(n)
				);
	}
}
