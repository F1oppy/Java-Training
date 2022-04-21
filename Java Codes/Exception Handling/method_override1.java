package Exception_handling_Demo;

class Parent1{
	void msg()throws Exception{
		System.out.println("Parent Method");
	}
}
class Child1 extends Parent1{
	void msg()throws ArithmeticException{
		System.out.println("Child Method");
	}
}
public class method_override1 {
	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.msg();
	}
}
