package Exception_handling_Demo;
import java.io.*;

class Parent{
	void msg()throws IOException{
		System.out.print("Parent Method");
	}
}
class Child extends Parent{
	void msg()throws IOException{
		System.out.print("Child Method");
	}
}


public class method_override_exception {
	public static void main(String[] args) {
		Child obj = new Child();
		try {
			obj.msg();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
