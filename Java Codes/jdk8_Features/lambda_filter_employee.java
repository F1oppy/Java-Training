package jdk8_Features;

import java.util.*;
import java.util.stream.Stream;

class Employee{
	int empid;
	String name;
	float salary;
	
	public Employee(int empid, String name, float salary) {
		super();
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
}
public class lambda_filter_employee {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		
		Employee e1=new Employee(69,"Aditya", 400001f);
		list.add(e1);
		list.add(new Employee(70,"Munni", 20000f));
		list.add(new Employee(71,"Sheela", 35000f));
		list.add(new Employee(72,"Chameli", 15000f));
		
		Stream<Employee> filteredData = list.stream().filter(e->e.salary>20000);
		
		filteredData.forEach(
				Employee->System.out.println(Employee.name+" "+Employee.salary));
	}

}
