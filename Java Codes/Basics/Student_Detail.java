package basics;
import java.util.*;

public class Student_Detail {
	public static void main(String args[]) {
		int nos;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Number of Students: ");
		nos=s.nextInt();
		
		int roll_no[] = new int[nos];
		String name[]= new String[nos];
		Float salary[] = new Float[nos];
		
		System.out.println("Enter Student Roll Number: ");
		for(int i=0;i<nos;i++) {
			roll_no[i]=s.nextInt(); 
		}
		System.out.println("Enter Student Name: ");
		for(int i=0;i<nos;i++) {
			name[i]=s.next(); 
		}
		System.out.println("Enter Student Marks: ");
		for(int i=0;i<nos;i++) {
			salary[i]=s.nextFloat(); 
		}

		System.out.println("Student Details are: ");
		
		for(String s1:name) {
			System.out.println("Student Name is: "+s1);
			System.out.println("========================================================");
		}
		for(int i:roll_no) {
			System.out.println("Employee Roll Number is: "+i);
			System.out.println("========================================================");
		}
		for(Float f:salary) {
			System.out.println("Employee Marks are: "+f);
			System.out.println("========================================================");
		}	
		s.close();
	}
}
