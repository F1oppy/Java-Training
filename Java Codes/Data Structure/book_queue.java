package Data_Structure;

import java.util.*;

class Book implements Comparable<Book>{
	int id;
	String name, author, publisher;
	int qty;
	
	public Book(int id, String name, String author, String publisher, int qty) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.qty=qty;
	}
	
	public int compareTo(Book b) {
		if(id > b.id) {
			return 1;
		}
		else if(id > b.id){
			return -1;
		}
		else {
			return 0;
		}
	}
}

public class book_queue {
	public static void main(String[] args) {
		Queue<Book> q = new PriorityQueue<Book>();
		
		Book b1 = new Book(121, "Java Programming", "Sun MC", "Sun MC", 90);
		Book b2 = new Book(123, "Java Programming", "Sun MC", "Sun MC", 80);
		Book b3 = new Book(125, "Java Programming", "Sun MC", "Sun MC", 70);
		
		q.add(b1);
		q.add(b2);
		q.add(b3);
			
		for (Book b:q) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.qty);
		}
		
	}
}