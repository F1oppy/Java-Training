package basics;

public class if_ex {
	public static void main(String args[]) {
		int avg = 82;
		if(avg>85) {
			System.out.println("first class");
		}
		else if(avg<80 && avg>85) {
			System.out.println("second class");
		}
		else {
			System.out.println("third class");
		}
	}
}
