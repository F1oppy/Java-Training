package basics;

public class cmd_line_ex2 {
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
			
		int sum = a+b;
		
		System.out.println("The Sum is: "+sum);
		}
}
