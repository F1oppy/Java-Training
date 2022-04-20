package basics;

interface circle22{
	void draw();
}

interface square{
	void draw();
}

class shape22 implements circle22,square{
	public void draw(){
		System.out.println("Circle and Square are beign drawn.");
	}
	static void display() {	
	}
}

public class shape_implementation {
	public static void main(String[] args) {
		shape22 c = new shape22();
		c.draw();
	}
}
