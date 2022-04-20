package basics;

class circle{
	float pi=3.14f,r;
	circle(float radius){
		r=radius;
	}
	void area() {
		float area = pi*r*r;
		System.out.println("Area of the Circle is "+area);
	}
	void circum() {
		float cir=2*pi*r;
		System.out.println("Area of the Circle is "+cir);
	}
}

public class shape {
	public static void main(String[] args) {
		circle c= new circle(45.6f);
		c.area();
	}
}
