package Multi_Thread;

public class thread_name extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		thread_name t1 = new thread_name();
		thread_name t2 = new thread_name();
		
		System.out.println("Name of t1: "+t1.getName());
		System.out.println("Name of t2: "+t2.getName());
		
		t1.start();
		t2.start();
		t1.setName("mythread1");
		t2.setName("mythread2");
		
		System.out.println("Name of t1: "+t1.getName());
		System.out.println("Name of t2: "+t2.getName());
	}
}
