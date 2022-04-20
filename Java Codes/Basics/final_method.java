package basics;

class parent33{
	void show(){ //final keyword here will not allow to override the method
		System.out.println("from parent class");
	}
}
class child33 extends parent33{
	void show(){
		System.out.println("from child class");
	}
}

public class final_method {
	public static void main(String[] args) {
		child33 c = new child33();
		c.show();
	}
}
