package basics;

public class Data_Types {
	public static void main(String args[]) {
		System.out.println("Employee Details");
		short rno=01;
		float m1,m2,m3,tot,avg;
		m1=56;
		m2=89;
		m3=79;
		tot=m1+m2+m3;
		avg=tot/3;
		String name="Aditya";
		long aadhar=456475342354L;
		boolean passed=true;
		
		System.out.println("RegNo: "+rno);
		System.out.println("Name: "+name);
		System.out.println("Aadhar: "+aadhar);
		System.out.println("Mark 1: "+m1);
		System.out.println("Mark 2: "+m2);
		System.out.println("Mark 3: "+m3);
		System.out.println("Average: "+avg);
		System.out.println("Total: "+tot);
		System.out.println("Result:" +passed);
	}

}
