package Exception_handling_Demo;

public class throw_ex {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not elegible for vote");
			}
		else {
			System.out.println("Person is elegible for vote");
		}
	}
	public static void main(String[] args) {
		validate(17);
		System.out.println("Code Executed Successfully!");
	}		
}
