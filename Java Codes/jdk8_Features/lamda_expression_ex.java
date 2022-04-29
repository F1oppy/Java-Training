package jdk8_Features;

interface Draw{
	public void square();
}

public class lamda_expression_ex {
	public static void main(String[] args) {
		
		String s = "is Drawing.";
		
		Draw d = new Draw() {
			
			public void square() {
				System.out.println("Square "+s);
			}
		};
		
		d.square();
	}
}
