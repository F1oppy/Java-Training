package Exception_handling_Demo;

public class finally_block {
	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[6]=10;
			System.out.println(a[6]);}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block always excecutes at last!");
		}
		System.out.println("Code Executed Successfully!");
	}
}
