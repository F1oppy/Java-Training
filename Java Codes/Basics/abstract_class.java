package basics;

abstract class bank {
	void display() {
		System.out.println("Non Abstract method from Abstract class");
	}
	abstract int roi(); {
		System.out.println("Non Abstract method from Abstract class");
	}
}
class sbi extends bank{
	int roi() {
		return 0;
	}
			
}
class icici extends bank{
	int roi() {
		return 12;
	}
}
class hdfc extends bank{
	int roi() {
		return 15;
	}
}
public class abstract_class {
	public static void main(String[] args) {
		sbi s = new sbi();
		icici i = new icici();
		hdfc h = new hdfc();
		
		System.out.println("SBI rate of intrest is "+s.roi());
		System.out.println("ICICI rate of intrest is "+i.roi());
		System.out.println("HDFC rate of intrest is "+h.roi());
		s.display();
	}
}
