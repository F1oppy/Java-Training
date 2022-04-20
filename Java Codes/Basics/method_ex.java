package basics;

public class method_ex {
	int add() {
		
		int a,b;
		a=56;
		b=44;
		int c=a+b;
		return c;
	}
	void sum() {
		int a,b;
		a=56;
		b=44;
		int c=a+b;
		System.out.println("The sum of Number is "+c);
	}
	float sub(float x,float y) {
		return x-y;
	}
	public static void main(String[] args) {
		method_ex obj = new method_ex();
		
		System.out.println(obj.add());
		obj.sum();
		System.out.println(obj.sub(89, 5));
	}
}
