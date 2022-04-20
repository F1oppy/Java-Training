package basics;

class method_demo{
	int calc(int x,int y)
	{
		return x+y;
	}
	int calc(int x,int y,int z)
	{
		return x*y+z;
	}
	float calc(float x, float y)
	{
		return x/y;
	}
}

public class method_overloading {
	public static void main(String[] args) {
		method_demo m = new method_demo();
		System.out.println(m.calc(23, 70));
		System.out.println(m.calc(23, 70, 87));
		System.out.println(m.calc(50.0f,20.0f));
	}
}
