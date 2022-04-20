package basics;

class Animal{
	String color="white";
}

class Dog extends Animal{
	String color = "black";
	
	void printColor(){
		System.out.println("This is Child colour "+color);
		System.out.println("This is Parent colour "+super.color);
	}
}

public class parent_variable_using_super {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.printColor();
	}
}
