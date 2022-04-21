package Exception_handling_Demo;

public class finalize_ex {
	public static void main(String[] args) {
		finalize_ex o = new finalize_ex();
		System.out.println("Hash code is: "+o.hashCode());
		o=null;
		System.gc();
		System.out.println("End of Garbage Collection.");
	}
	protected void finalize() {
		System.out.println("Calling Finally Method.");
	}
}
