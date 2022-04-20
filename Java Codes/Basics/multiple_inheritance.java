package basics;

interface p1{
	void show();
}

interface p2{
	void show();
}

class child implements p1,p2{
	public void show(){
		System.out.println("Multiple Inheritance achieved using interface.");
	}
	static void display() {	
	}
}

public class multiple_inheritance {
	public static void main(String[] args) {
		child c = new child();
		c.show();
	}
}
