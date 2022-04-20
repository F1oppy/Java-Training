package Exception_handling_Demo;

public class NumberFormat {
	public static void main(String[] args) {
		try {
		String a="10",b="20";
		System.out.println(a+b);
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(null);
		System.out.println(x+y);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the Code");
		
	}
}
