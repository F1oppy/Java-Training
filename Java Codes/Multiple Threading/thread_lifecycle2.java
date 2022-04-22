package Multi_Thread;

class life_cycle implements Runnable{
	private Thread t;
	private String threadName;
	
	life_cycle(String name){
		threadName = name;
		System.out.println("Creating "+threadName);
	}
	public void run() {
		System.out.println("Creating "+threadName);
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Thread: "+threadName+","+i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println("Thread: "+threadName+" interrupted");
		}
		System.out.println("Thread: "+threadName+" exiting");
	}
	public void start() {
		System.out.println("Starting "+threadName);
		if(t==null) {
			t = new Thread(this,threadName);
			t.start();
		}
	}	
}

public class thread_lifecycle2 {
	public static void main(String[] args) {
		life_cycle t1= new life_cycle("object-1");
		t1.start();
		
		life_cycle t2= new life_cycle("object-2");
		t2.start();
	}
}
