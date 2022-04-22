package Multi_Thread;

class multi_task4 extends  Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}	
class multi_task5 extends  Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}	
}
class multi_task6 extends  Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i*i);
		}
	}
}

public class multi_thread3{
	public static void main(String[] args) {
		multi_task4 m1 =new multi_task4();
		m1.start();
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		multi_task5 m2 =new multi_task5();
		m2.start();
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		multi_task6 m3 =new multi_task6();
		m3.start();
	}
}