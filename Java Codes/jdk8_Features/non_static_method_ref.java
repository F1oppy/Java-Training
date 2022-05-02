package jdk8_Features;

interface Sayable1234{
	void say();
}

public class non_static_method_ref {
	public void saySomething() {
		System.out.println("Hello from non static or instance keyword");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		non_static_method_ref mf = new non_static_method_ref();
	
		Sayable1234 s= mf::saySomething;
		
		Sayable1234 s1 = new non_static_method_ref()::saySomething;
		
		s.say();
	}
}
