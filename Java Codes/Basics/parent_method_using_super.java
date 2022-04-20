package basics;

class animal1{
	String color="white";
	void eat() {
		System.out.println("Eating....(Parent Class)");
	}
}

class dog1 extends animal1{
	void bark(){
		System.out.println("Barking....");
	}
	void eat(){
		System.out.println("Eating....");
	}
	void work(){
		super.eat();
		System.out.println("Working....");
		
	}
}

public class parent_method_using_super {
	public static void main(String[] args) {
		dog1 d = new dog1();
		d.bark();
		d.eat();
		d.work();
	}
}
