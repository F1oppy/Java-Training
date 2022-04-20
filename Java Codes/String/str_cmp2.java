package String;

public class str_cmp2 {
	public static void main(String[] args) {
		String str1 = "Aditya";
		String str2 = "Aditya";
		String str3 = new String( "Aditya");
		
		System.out.println(str1==str2);// "==" compares the address of string while ".equals" compares the Value
		System.out.println(str1==str3);
		
	}
}
