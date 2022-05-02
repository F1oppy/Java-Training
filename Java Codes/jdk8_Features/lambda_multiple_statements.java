package jdk8_Features;

interface Sayable12{
	String say (String msg);
}

public class lambda_multiple_statements {
	public static void main(String[] args) {
		Sayable12 person = (msg) ->{
			String s1 = "I would like to say";
			String s2 = s1+msg;
			return s2;
		};
		System.out.println(person.say("time is precious"));
	}
}
