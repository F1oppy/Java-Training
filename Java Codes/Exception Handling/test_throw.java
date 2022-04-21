package Exception_handling_Demo;
import java.io.*;

public class test_throw {
	public static void method()throws FileNotFoundException {
		FileReader f= new FileReader("C:\\users\\abc.txt");
		
		@SuppressWarnings({ "unused", "resource" })
		BufferedReader fi = new BufferedReader(f);
		throw new FileNotFoundException();
	}
	public static void main(String[] args) {
		try {
			method();
		}
		catch(FileNotFoundException e) {
		System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}
