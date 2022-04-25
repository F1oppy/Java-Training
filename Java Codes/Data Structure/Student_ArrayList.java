package Data_Structure;

import java.util.*;

class Student{
	int rollno;
	String name;
	int age;
	
	Student(int rollno, String name, int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}

public class Student_ArrayList {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Student s1 = new Student(101,"David",20);
		Student s2 = new Student(102,"Renu",21);
		Student s3 = new Student(103,"Mano",18);
		
		ArrayList al = new ArrayList<Student>();
		
		al.add(s1);al.add(s2);al.add(s3);
		
		Iterator i = al.iterator();
		
		while(i.hasNext()) {
			Student st = (Student)i.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age+" ");
		}
		
	}
}
