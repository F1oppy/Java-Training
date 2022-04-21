package Exception_handling_Demo;

public class nested_try {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			try {
				int a[]=new int[5];
				a[6]=10;}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
			try {
				int b = 5/0;
				}
			catch(ArithmeticException e){
				System.out.println(e);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Code Executed Successfully!");
	}
}
