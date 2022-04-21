package Exception_handling_Demo;

public class multiple_catch {
	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[6]=10;
			@SuppressWarnings("unused")
			int b = 5/0;
			}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Code Executed Successfully!");
	}
}
