package Exception_handling_Demo;

class Parent2{
	void msg()throws ArithmeticException{
		System.out.println("Parent Method");
	}
}
class Child2 extends Parent2{
	void msg()throws ArrayIndexOutOfBoundsException{
		super.msg();
		System.out.println("Child Method");
	}
}
public class method_override2 {
	public static void main(String[] args) {
		Child2 obj = new Child2();
		obj.msg();
	}
}
