package jdk8_Features;

public class method_reference_thread {
	public static void ThreadStatus() {
		System.out.println("Thread is Running");
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(method_reference_thread::ThreadStatus);
		t1.start();
	}
}
