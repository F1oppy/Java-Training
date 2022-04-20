package basics;
import java.util.*;

public class E_Bill {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Consumer Name: ");
		String name = s.nextLine();
		
		System.out.println("Enter Meter Number: ");
		int meter_no = s.nextInt();
		
		System.out.println("Enter Total Units: ");
		int tot_units = s.nextInt();
		
		System.out.println("Enter Per Unit Price: ");
		int tot_price = s.nextInt();
		s.close();
		
		float tot_amt = tot_units*tot_price;
		
		System.out.println("Consumer Name: "+name);
		System.out.println("For Meter Number "+meter_no+", Total Amount is: "+tot_amt);
	}
	
}
