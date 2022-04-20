package Exception_handling_Demo;

public class String_index {
	public static void main(String[] args) {
		String str = "Welcome to java exception Handling";
		try {
		System.out.println("Length: " +str.length());
		System.out.println("Length: " +str.substring(40));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Res of the Code");
	}
}
