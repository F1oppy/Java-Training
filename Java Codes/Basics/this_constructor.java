package basics;

class C{
	C(){
		System.out.println("From current classs constructor");
	}
	C(int x){
		this();
		System.out.println("X = "+x);
	}
}

public class this_constructor {
	public static void main(String[] args) {
		new C(10);
	}
}
