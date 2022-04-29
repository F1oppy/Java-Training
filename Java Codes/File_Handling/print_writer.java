package File_Handeling;

import java.io.*;

public class print_writer {
	public static void main(String[] args)throws Exception {
		
		PrintWriter pw = new PrintWriter(System.out);
		pw.write("Data written PrintWriter");
		
		pw.close();
		
		PrintWriter writer1=null;
		writer1 = new PrintWriter (new File("C:\\test123.txt"));
		writer1.write("Like Java, SpringBoot, Hibernate, etc");
		writer1.close();	
	}
}
