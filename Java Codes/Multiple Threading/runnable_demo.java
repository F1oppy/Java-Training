package Multi_Thread;

class multi1 implements Runnable{				// implements used to class->Interface relation
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
}

public class runnable_demo {
	public static void main(String[] args) {
		multi1 t1 = new multi1();
		Thread thread1 = new Thread(t1);
		thread1.start();
	}
}
