package basics;
import java.util.*;

class customer1{
	String name, address;
	int id;
	
	void customer_data(){
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the customer ID: ");
		id=s.nextInt();
		
		System.out.println("Enter the customer Name: ");
		name=s.next();
		
		System.out.println("Enter the customer Address: ");
		address=s.next();

		s.close();
	}
	void cus_report() {
		System.out.println("Customer ID: "+id);
		System.out.println("Customer Name: "+name);
		System.out.println("Customer Address: "+address);
	}
}
class product extends customer1{
		String name;
		int id, price;
		void product_data(){
			Scanner s= new Scanner(System.in);
			
			System.out.println("Enter the product ID: ");
			id=s.nextInt();
			
			System.out.println("Enter the product Name: ");
			name=s.next();
			
			System.out.println("Enter the product Price: ");
			price=s.nextInt();
			
			s.close();
		}
		void product_report() {
			System.out.println("Product ID: "+id);
			System.out.println("Product Name: "+name);
			System.out.println("Product Price: "+price);
		}
}
class account extends product{
	String acc_type;
	int acc_no, balance_amt;
	
	void accounts_data(){
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the Account Number: ");
		acc_no=s.nextInt();
		
		System.out.println("Enter the Account Type: ");
		acc_type=s.next();
		
		System.out.println("Enter the Account Balance: ");
		balance_amt=s.nextInt();

		s.close();
	}
	void account_report() {
		System.out.println("Account number is: "+acc_no);
		System.out.println("Account Type is: "+acc_type);
		System.out.println("Account Balance is: : "+balance_amt);
	}
}

public class multi_level {
	public static void main(String[] args) {
		account a=new account();
		a.customer_data();
		a.cus_report();
		
		a.accounts_data();
		a.account_report();
		
		a.product_data();
		a.product_report();
	}
}

