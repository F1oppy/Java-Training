package basics;
import java.util.Scanner;

public class Candy_Game {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int i, n=0;
		int x = s.nextInt();
		while(x!=0) {
			i=(x%10);
			x=x/10;
			if(i==4)
			n++;
		}
		System.out.println("Occurance of Number 4 is: "+n);
		s.close();
	}
}