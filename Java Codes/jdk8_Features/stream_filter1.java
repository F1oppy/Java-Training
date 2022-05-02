package jdk8_Features;

import java.util.*;
import java.util.stream.Collectors;

class product11{
	int id;
	String name;
	float price;
	
	product11(int id, String name, float price){
		this.id=id;
		this.name=name;
		this.price=price;
	}

public class stream_filter1 {
	public static void main(String[] args) {
		
		ArrayList<product11> p_list = new ArrayList<product11>();
		
		p_list.add(new product11(1, "HP Laptop", 25000f));
		p_list.add(new product11(2, "Lenovo Laptop", 23000));
		p_list.add(new product11(3, "Dell Laptop", 35000f));
		p_list.add(new product11(4, "Apple Laptop", 125000f));
		p_list.add(new product11(5, "Sony Laptop", 35000f));
		
		p_list.stream()
		.filter(p->p.price==30000)
		.forEach(p->System.out.println(p.name));
		
		double total = p_list.stream()
				.collect(Collectors.summingDouble(p->p.price));
		System.out.println(total);
		
		long count=p_list.stream().filter(p->p.price>3000).count();
		System.out.println(count);
		
		Map<Integer,String> p_map=p_list.stream()
				.collect(Collectors.toMap(p->p.id, p->p.name));
		System.out.println(p_map);
		}
	}
}
