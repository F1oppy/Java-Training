package Data_Structure;

import java.util.*;

class Book2{
	int id;
	String name, author, publisher;
	int qty;
	
	public Book2(int id, String name, String author, String publisher, int qty) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.qty=qty;
	}
}

public class book_linked_hashset {
	public static void main(String[] args) {
		LinkedHashSet<Book2> hs = new LinkedHashSet<Book2>();
		
		Book2 b1 = new Book2(101, "Learning Python with Shaw", "Shaw", "NOVO", 90);
		Book2 b2 = new Book2(102, "Marry Me Stranger", "N.Chakraborty", "penguin", 80);
		Book2 b3 = new Book2(103, "Forget me not Stranger", "N.Chakraborty", "penguin", 70);
		Book2 b4 = new Book2(104, "The Immortals of Meluha", "Amish Tripathi", "penguin", 100);
		
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		hs.add(b4);
			
		for (Book2 b:hs) {
			System.out.println(b.id+" || "+b.name+" || "+b.author+" || "+b.publisher+" || "+b.qty);
			System.out.println("------------------------------------------------------------------");
		}
		
	}
}