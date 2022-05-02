package jdk8_Features;

interface Sayable123{
	void say();
}

public class method_reference {
	public static void saySomething () {
		System.out.println("Hi from static method");
	}
	public static void main(String[] args) {
		Sayable123 s = method_reference::saySomething;
		s.say();
	}
}
