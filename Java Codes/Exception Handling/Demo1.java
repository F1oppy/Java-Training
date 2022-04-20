package Exception_handling_Demo;

public class Demo1 {
	public static void main(String[] args) {
		try{
		int x = 10/0;
		System.out.println(x);
		}catch (ArithmeticException e){
			System.out.println(e);
		System.out.println("After the exception.");
		System.out.println("After the exception.");
		}
	}
}
