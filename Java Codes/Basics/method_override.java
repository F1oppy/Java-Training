package basics;

class parent{
	void show(){
		System.out.println("From Parent class");
	}
}

class child1 extends parent{
	void show(){
		System.out.println("From Child class");
	}
}

public class method_override {
	public static void main(String[] args) {
		parent p = new parent();
		p.show();
		child1 c = new child1();
		c.show();
		
	}
}
