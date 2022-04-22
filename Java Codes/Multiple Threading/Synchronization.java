package Multi_Thread;

class Table{
	synchronized void printTable(int n) { // we can use static keyword too
		for(int i=1;i<=5;i++) {
			System.out.println(i*n);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class myThread1 extends Thread{
	Table t;
	myThread1(Table t){
		this.t=t;
	}
	
	public void run() {
		 t.printTable(5);
	}
}

public class Synchronization {
	public static void main(String[] args) {
		Table obj = new Table();
		myThread1 t1 = new myThread1(obj);
		myThread1 t2 = new myThread1(obj);
		myThread1 t3 = new myThread1(obj);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
