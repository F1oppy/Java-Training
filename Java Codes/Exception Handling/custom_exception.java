package Exception_handling_Demo;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}
}

public class custom_exception {
	static void validate(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Age is not valid for vote");
		}
		else {
			System.out.println("Welcome to Vote");
		}
	}
	public static void main(String[] args) {
		try {
			validate(13);
		}catch(InvalidAgeException e) {
			System.out.println(e);
		}
	}
}
