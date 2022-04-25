package Data_Structure;

import java.util.*;

class Employee{
	int empno, age;
	String name;
	float salary;
	
	Employee(int empno, String name, int age, float salary){
		this.empno=empno;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
}

public class Employee_ArrayList {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Employee e1 = new Employee(111,"Aditya",23, 650000.0f);
		Employee e2 = new Employee(112,"Aditi",22, 550000.0f);
		Employee e3 = new Employee(113,"Adi",21, 650000.0f);
		
		ArrayList al = new ArrayList<Employee>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Iterator i = al.iterator();
		
		while(i.hasNext()) {
			Employee ep = (Employee)i.next();
			System.out.println(ep.empno+" || "+ep.name+" || "+ep.age+" || "+ep.salary);
			System.out.println("--------------------------------");
		}
	}
}
