package Multi_Thread;

public class multi_task extends  Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		multi_task m = new multi_task();
		m.start();
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		multi_task m1 = new multi_task();
		m1.start();
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
		}
		multi_task m2 = new multi_task();
		m2.start();
	}
}
