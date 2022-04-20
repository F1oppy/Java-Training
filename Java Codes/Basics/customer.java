package basics;

public class customer {
	int id;
	String address, name;
	
	customer(int id, String name, String address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() {
		System.out.println("Customer ID: "+id);
		System.out.println("Customer Name: "+name);
		System.out.println("Customer Address: "+address);
	}
	public static void main(String[] args) {
		customer obj = new customer(101,"Aditya","Rajasthan");
		obj.display();
		customer obj1 = new customer(102,"Aditi","Pune");
		obj1.display();
	}
}
