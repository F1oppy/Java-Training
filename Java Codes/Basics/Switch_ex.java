package basics;

public class Switch_ex {
	public static void main(String args[]) {
		int avg = 85;
		switch(avg) {
		case 85:
			System.out.println("first class");
			break;
		case 75:
			System.out.println("second class");
			break;
		case 65:
			System.out.println("third class");
			break;
		default:
			System.out.println("below third class");
			break;
		}
	}
}
