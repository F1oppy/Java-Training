package String;

public class immutable_str {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Aditya");
		s.append(" Dadheech");
		System.out.println(s);//Output will be Aditya only as it will not get concatenated because Strings are immutable. Aditya is stored in String constant pool(Heap) and object s is stored in Stack memory
	}
}
