package basics;

import java.util.Scanner;

public class armstrong_number {
	void arm_strong(int num) {
		int temp,total=0,number;
		number=num;
		while(num!=0) {
			temp = num%10;
			total+=temp*temp*temp;
			num=num/10;
		}
		if(total==number) {
			System.out.println("Given Number is Armstrong Number: "+number);
		}
		else {
			System.out.println("Given Number is not Armstrong Number: "+number);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Your Number: ");
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		armstrong_number obj = new armstrong_number();
		
		
		obj.arm_strong(num);
		s.close();
	}
}
