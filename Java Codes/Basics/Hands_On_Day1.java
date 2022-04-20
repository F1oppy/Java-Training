package basics;

public class Hands_On_Day1 {
	public static void main(String args[]) {
		for(int i=1;i<=10;i++) {
			if(i<11) {
				System.out.println(i+"*"+i+"="+i*i);
			}
			if(i==3) {
				break;
			}
		}
	}
}
