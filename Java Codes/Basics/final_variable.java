package basics;

class Person3{
	final long aadhar =12753812921l;
	String name = "Aditya";
}

public class final_variable {
	public static void main(String[] args) {
		Person3 p = new Person3();
		//p.aadhar= 354984651679l; (Can only change aadhar when we remove final keyword
		System.out.println("Aadhar Number is: "+p.aadhar);
	}
}
