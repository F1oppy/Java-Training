package Data_Structure;

import java.util.*;

class Student1{
	int rollno;
	String name;
	int age;
	
	Student1(int rollno, String name, int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}

public class Student_LinkedList {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Student1 s1 = new Student1(101,"David",20);
		Student1 s2 = new Student1(102,"Renu",21);
		Student1 s3 = new Student1(103,"Mano",18);
		
		LinkedList al = new LinkedList<Student>();
		
		al.add(s1);al.add(s2);al.add(s3);
		
		Iterator i = al.iterator();
		
		while(i.hasNext()) {
			Student1 st = (Student1)i.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age+" ");
		}
		
	}
}
