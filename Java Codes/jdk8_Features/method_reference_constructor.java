package jdk8_Features;

interface Messageable{
	Message getMessage(String msg);
}
class Message{
	Message(String msg){
		System.out.println(msg);
	}
}

public class method_reference_constructor {
	public static void main(String[] args) {
		Messageable m = Message::new;
		m.getMessage("Welcome");
	}
}
