package String;

public class str_cmp {
	public static void main(String[] args) {
		String s1= "Aditya";
		String s2= "Aditya";
		String s3= new String("Aditya");
		String s4= "Aditi";
		String s5="ADITYA";
		
		System.out.println(s1.equals(s2));	
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s5));
	}
}
