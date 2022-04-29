package jdk8_Features;

interface Addable{
	int add(int a, int b);
}

public class lambda_exp2 {
	public static void main(String[] args) {
		
		Addable a1=(a,b)->(a+b);
		System.out.println(a1.add(20,39));
		
		Addable a2=(int a, int b)->{
			return (a+b);
		};
		System.out.println(a2.add(200,800));
	}
}
