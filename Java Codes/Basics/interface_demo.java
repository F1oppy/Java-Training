package basics;

interface bank2{
	String PAN="KYPD927491L";
	int roi();
	static void display() {
		System.out.println("Static Method Implimentation:");
	}
	default void show() {
		System.out.println("Default Method Implimentation:");
	}
}
class sbi2 implements bank2{
	public int roi() {
		return 0;
	}
			
}
class icici2 implements bank2{
	public int roi() {
		return 12;
	}
}
class hdfc2 implements bank2{
	public int roi() {
		return 15;
	}
}
public class interface_demo {
	public static void main(String[] args) {
		sbi2 s=new sbi2();
		icici2 i=new icici2();
		hdfc2 h=new hdfc2();
		
		System.out.println("SBI rate of intrest is "+s.roi());
		System.out.println("ICICI rate of intrest is "+i.roi());
		System.out.println("HDFC rate of intrest is "+h.roi());
		System.out.println(bank2.PAN);
		bank2.display();
		s.show();
	}
}

