package File_Handeling;

import java.io.*;

@SuppressWarnings("serial")
class stu implements Serializable{
	int regno;
	String name;
	
	public stu(int regno, String name){
		this.regno=regno;
		this.name=name;
	}
}

public class serialization {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			
			stu s1 = new stu(101,"Ravi");
			stu s2 = new stu(102,"Ritvik");
			stu s3 = new stu(103,"Rutuja");
			
			FileOutputStream fout = new FileOutputStream("C:\\student.txt");
			ObjectOutputStream o = new ObjectOutputStream(fout);
			
			o.writeObject(s1);
			o.writeObject(s2);
			o.writeObject(s3);
		}
		catch(Exception e){
			System.out.println(e);
	}
		System.out.println("Success!");
	}
}
