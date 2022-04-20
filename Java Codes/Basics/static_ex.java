package basics;

class Acc{
	static int acc_no;
	static String name, acc_type;
	static long aadhar= 21467839716l;
	
	void display() {
		System.out.println("Account Number: "+acc_no);
		System.out.println("Account Name: "+name);
		System.out.println("Account Type: "+acc_type);
	}
	
	static void show() {
		System.out.println("Account Number: "+acc_no);
		System.out.println("Account Name: "+name);
		System.out.println("Account Type: "+acc_type);
	}
	
}

public class static_ex {
	public static void main(String[] args) {
		Acc obj = new Acc();
		Acc.acc_no = 1011;
		Acc.name="Aditya";
		Acc.acc_type = "Current";
		
		System.out.println("Account Number: "+Acc.acc_no);
		
		System.out.println("Aadhar Number before changing: "+Acc.aadhar);
		Acc.aadhar = 6548132176513l;
		System.out.println("Aadhar Number after changing: "+Acc.aadhar);
		
		obj.display();
		Acc.show();
	}
}
