package basics;

import java.util.Scanner;

public class leap_year {
	
	void leap(int year) {
		if(year%4==0) {
			System.out.println(year+" is a Leap Year");
		}
		else
			System.out.println(year+" is not a Leaap Year");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Your Year: ");
		Scanner s=new Scanner(System.in);
		int year = s.nextInt();
		leap_year obj = new leap_year();
		
		
		obj.leap(year);
		s.close();
	}
}
