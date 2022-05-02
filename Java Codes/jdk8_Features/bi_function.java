package jdk8_Features;

import java.util.function.BiFunction;

class Arithmetic{
	public static int add(int a, int b) {
		return a+b;
	}
}

public class bi_function {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer>sum=Arithmetic::add;
		
		int result=sum.apply(34, 65);
		System.out.println(result);
	}
}
