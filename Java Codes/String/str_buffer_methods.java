package String;

public class str_buffer_methods {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello World");
		StringBuffer s1 = new StringBuffer("Hello");
		s.append("Java");
		System.out.println(s);
		s.insert(1,"Java");
		System.out.println(s);
		s.replace(1,3,"Buffer");
		System.out.println(s);
		s.delete(1,3);
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		System.out.println(s1.capacity());
	}
}
