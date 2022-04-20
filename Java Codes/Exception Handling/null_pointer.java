package Exception_handling_Demo;

public class null_pointer {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.print(e);
		}
		System.out.println("Rest of the code.");
	}
}
