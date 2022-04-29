package File_Handeling;

import java.io.*;

public class print_stream {
	public static void main(String[] args) throws IOException{
	
		FileOutputStream fout = new FileOutputStream("C:\\print_demo.txt");
		
		PrintStream pout = new PrintStream(fout);
		
		pout.println(2016);
		pout.println("Hello Java");
		pout.println("Welcome to Java InputOutput");
		
		pout.close();
		fout.close();
		
		System.out.println("Success!");
}
}
