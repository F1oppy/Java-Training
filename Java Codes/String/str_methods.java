package String;

import java.util.Arrays;

public class str_methods {
	public static void main(String[] args) {
		String s="Aditya Dadheech";
		String s1="        Aditya Dadheech     ";
		
		System.out.println("Original String: "+s);
		System.out.println("Sub String from index 6: "+s.substring(6));
		System.out.println("Sub String from index 0 to 6: "+s.substring(0,6));
		
		String msg = new String("Hello, Good Evening to Everyone!");
		
		String text[]=msg.split(",");
		System.out.println(Arrays.toString(text));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s1);
		System.out.println(s.trim());
		System.out.println(s.startsWith("Ad"));
		System.out.println(s.endsWith("h"));
		System.out.println(s.charAt(6));
		System.out.println(s.charAt(10));
		System.out.println(s.length());
		System.out.println(s.replace("Aditya", "Dadheech"));
		System.out.println("Original String: "+s);
	}
}
