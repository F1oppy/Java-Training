package Excercise;
import java.util.*;

public class Excercise_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of the Event");
		String s = sc.nextLine();
		System.out.println("Enter the Type of Event");
		String s1 = sc.nextLine();
		System.out.println("Number of People Expected");
		int n = sc.nextInt();
		System.out.println("Is it a paid Entry?(Type Y or N)");
		String c = sc.next();
		System.out.println("Enter the projected Expenses(in Lakhs) for this Event.");
		float f= sc.nextFloat();
		System.out.println("Event Name is: "+ s);
		System.out.println("Type of Event is: "+ s1);
		System.out.println("Number of Events Hosted in Codissia is: "+ n);
		System.out.println("Paid Entry: "+ c);
		System.out.println("Projected Expenses: "+ f);
		sc.close();
	}
}