package junit_demo;

public class DivisionTest123 {
	int num1,num2;
	
	public DivisionTest123(int num1, int num2){
		this.num1=num1;
		this.num2=num2;
	}
	public int division() throws ArithmeticException{
		return num1/num2;
	}
}
