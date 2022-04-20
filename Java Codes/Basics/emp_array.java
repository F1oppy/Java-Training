package basics;
import java.util.*;

public class emp_array {
	public static void main(String args[]) {
		int nos;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Number of Employees: ");
		nos=s.nextInt();
		
		int emp_no[] = new int[nos];
		String name[]= new String[nos];
		Float salary[] = new Float[nos];
		
		System.out.println("Enter Employee Number: ");
		for(int i=0;i<nos;i++) {
			emp_no[i]=s.nextInt(); 
		}
		System.out.println("Enter Employee Name: ");
		for(int i=0;i<nos;i++) {
			name[i]=s.next(); 
		}
		System.out.println("Enter Employee Salary: ");
		for(int i=0;i<nos;i++) {
			salary[i]=s.nextFloat(); 
		}

		System.out.println("Employee Details are: ");
		
		for(int i=0;i<nos;i++) {
			System.out.println("Employee Name is: "+name[i]);
		}
		for(int i=0;i<nos;i++) {
			System.out.println("Employee Number is: "+emp_no[i]);
		}
		for(int i=0;i<nos;i++) {
			System.out.println("Employee Salary is: "+salary[i]);
		}	
		s.close();
	}
}
