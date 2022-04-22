package Multi_Thread;

class multi_task2 extends  Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i*i);
		}
	}
}	
class multi_task3 extends  Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i*i*i);
		}
	}	
}
public class multi_thread2{
	public static void main(String[] args) {
		multi_task2 m1 =new multi_task2();
		m1.start();
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		multi_task3 m2 =new multi_task3();
		m2.start();
	}
}