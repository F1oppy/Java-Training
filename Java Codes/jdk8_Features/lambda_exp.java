package jdk8_Features;

interface Drawable1{
	public void draw();
}

public class lambda_exp {
	public static void main(String[] args) {
		Drawable1 d=()->{							//"()->{}" is the lambda interface used to create a function without Written type
			System.out.println("Lambda Expression used to give implementation to the functional interface");
		};
		
		d.draw();
	}
}
