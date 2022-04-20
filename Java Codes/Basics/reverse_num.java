package basics;

import java.util.Scanner;

public class reverse_num {
	void rev(int num) {
		int rem,reverse=0;
		while(num!=0) {
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		System.out.println("Reverse Number will be : "+reverse);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Your Number: ");
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		reverse_num obj = new reverse_num();
		
		
		obj.rev(num);
		s.close();
	}
}
