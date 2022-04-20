package Exception_handling_Demo;

public class arry_index {
	public static void main(String[] args) {
		int regno[] = new int[10];
		
		regno[0]=0;
		System.out.println("0th index is: "+regno[0]);
		
		try {
		regno[10]=0;
		System.out.println("10th index is: "+regno[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);}
		
		System.out.println("Rest of the Code");
	}
}
