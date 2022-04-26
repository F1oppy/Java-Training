package Data_Structure;

import java.util.*;

class Book1{
	int id;
	String name, author, publisher;
	int qty;
	
	public Book1(int id, String name, String author, String publisher, int qty) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.qty=qty;
	}
}

public class book_deque{
	public static void main(String[] args) {
		Deque<Book1> q = new ArrayDeque<Book1>();
		
		Book1 b1 = new Book1(01, "Biotechnology", "Dr.Manish", "JNU", 96);
		Book1 b2 = new Book1(02, "Recombinant DNA", "Dr.Shashank", "IGBT", 69);
		Book1 b3 = new Book1(03, "AMAZON AWS", "AMAZON", "Amazon", 88);
		
		q.add(b1);
		q.add(b2);
		q.add(b3);
			
		for (Book1 b:q) {
			System.out.println(b.id+" || "+b.name+" || "+b.author+" || "+b.publisher+" || "+b.qty);
			System.out.println("----------------------------------------------------");
		}
	}
}