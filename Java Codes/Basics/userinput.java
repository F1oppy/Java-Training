package basics;
import java.util.*;

public class userinput {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Employee Name: ");
		String name = s.next();
		
		System.out.println("Enter Employee Number: ");
		int emp_no = s.nextInt();
		
		System.out.println("Enter Employee Salary: ");
		float salary = s.nextFloat();
		
		float da = salary*15/100;
		float hra=30*salary/100;
		float pf=12*salary/100;
		float esi=15*salary/100;
		float tot_deduction = pf+esi;
		float tot_earnings=salary+da+hra;
		float gross_pat=tot_earnings-tot_deduction;
		
		System.out.println("============================================================");
		System.out.println("Employee Details");
		System.out.println("============================================================");
		System.out.println("Employee Number: "+emp_no);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee DA: "+da);
		System.out.println("Employee HRA: "+hra);
		System.out.println("Employee PF: "+pf);
		System.out.println("Employee ESI: "+esi);
		System.out.println("Employee Total Deduction: "+tot_deduction);
		System.out.println("Employee Total Earnings: "+tot_earnings);
		System.out.println("Employee Gross Pat: "+gross_pat);
		s.close();
	}
}
