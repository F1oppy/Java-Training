package Multi_Thread;

class demo_thread extends Thread{
	public void run() {
		System.out.println("Thread is running!");
	}
}
public class multi_thread {
	public static void main(String[] args) {
		demo_thread m = new demo_thread();
		m.start();
	}
}
