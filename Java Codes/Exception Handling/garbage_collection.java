package Exception_handling_Demo;

public class garbage_collection {
	public void finalize(){
		System.out.println("object is garbage collected!");
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		garbage_collection s1 = new garbage_collection();
		@SuppressWarnings("unused")
		garbage_collection s2 = new garbage_collection();
		
		s1=null;
		s2=null;
		
		System.gc();
	}
}
