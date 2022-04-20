package basics;

class parent32{ //final keyword here will not allow to inherit the class
	void show(){
		System.out.println("from parent class");
	}
}
class child32 extends parent33{
	void show(){
		System.out.println("from child class");
	}
}

public class final_class {
	public static void main(String[] args) {
		child32 c = new child32();
		c.show();
	}
}
