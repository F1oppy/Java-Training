package basics;

public class Emp_Payslip {
	public static void main(String args[]) {
		int emo = 1;
		String name ="Aditya";
		long bas_Salary = 37889;
		if(bas_Salary >25000) {
			System.out.println("EmpID "+emo+" "+name+"'s"+", HRA will be "+bas_Salary*20/100);
		}
		else if(bas_Salary>35000){
			System.out.println("HRA will be "+bas_Salary*25/100);
		}
	}
}
