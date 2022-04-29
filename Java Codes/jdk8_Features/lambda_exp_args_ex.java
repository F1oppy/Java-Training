package jdk8_Features;

interface Drawable2{
	public void draw(String name);
}

public class lambda_exp_args_ex {
	public static void main(String[] args) {
		Drawable2 d=(name)->{							//Passing Argument in lambda created function
			System.out.println("Drawing the: "+name);
		};
		
		d.draw("Circle");
	}
}
