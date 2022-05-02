package jdk8_Features;

import java.util.*;
import java.util.stream.Stream;

class product{
	int id;
	String name;
	float price;
	
	public product(int id, String name, float price) {
		super();
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class lambda_filter {
	public static void main(String[] args) {
		List<product> list = new ArrayList<product>();
		
		product p1=new product(102,"Iphone", 54000f);
		list.add(p1);
		list.add(new product(101,"Samsung", 17000f));
		list.add(new product(103,"Nokia", 47000f));
		list.add(new product(104,"Sony", 19000f));
		
		Stream<product> filteredData = list.stream().filter(p->p.price>25000);
		
		filteredData.forEach(
				product->System.out.println(product.name+" "+product.price));
	}

}
