package jdk8_Features;

interface sayable1{
	void say(String msg);
	int hashCode();
	String toString();
	boolean equals();
	}

public class functional_interface_ex implements sayable1 {

	@Override
	public void say(String msg) {
		System.out.println("Hello "+msg);
	}
	
	@Override
	public boolean equals() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		functional_interface_ex obj = new functional_interface_ex();
		obj.say("World");
	}
}
