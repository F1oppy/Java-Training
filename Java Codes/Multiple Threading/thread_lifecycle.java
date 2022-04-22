package Multi_Thread;

public class thread_lifecycle {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		System.out.println("State 1: "+t1.getState());
		
		t1.start();
		System.out.println("State 2: "+t1.getState());
		
		try {
			t1.sleep(1000);
		}catch(Exception e) {e.printStackTrace();
		}
		System.out.println("State 3: "+t1.getState());
	}
}
