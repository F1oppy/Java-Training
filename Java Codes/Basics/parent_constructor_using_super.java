package basics;

class parent1{
	parent1(){
		System.out.println("This is parent class Constructor");
	}
}

class child2 extends parent1{
	child2(){
		super();
		System.out.println("This is child class Constructor");
	}
}

public class parent_constructor_using_super {
	public static void main(String[] args) {
		new child2();
	}
}
