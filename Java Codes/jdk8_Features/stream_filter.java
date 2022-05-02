package jdk8_Features;

import java.util.*;
import java.util.stream.*;

class product1{
	int id;
	String name;
	float price;
	
	product1(int id, String name, float price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class stream_filter {
	public static void main(String[] args) {
		
		ArrayList<product1> p_list = new ArrayList<product1>();
		
		p_list.add(new product1(1, "HP Laptop", 25000f));
		p_list.add(new product1(2, "Lenovo Laptop", 23000));
		p_list.add(new product1(3, "Dell Laptop", 35000f));
		p_list.add(new product1(4, "Apple Laptop", 125000f));
		p_list.add(new product1(5, "Sony Laptop", 35000f));
		
		List<Float> p_list2 = p_list.stream()
				.filter(p->p.price>3000)
				.map(p->p.price)
				.collect(Collectors.toList());
		
		System.out.println(p_list2);
	}
}
