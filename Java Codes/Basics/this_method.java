package basics;

class A1{

	void m(){
		System.out.println("This is M");
	}
	void n(){
		System.out.println("This is N");
		this.m();
	}
}

public class this_method {
	public static void main(String[] args) {
		A1 obj = new A1();
		obj.n();
	}
}
