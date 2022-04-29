package File_Handeling;

import java.io.*;

public class file_reader {
	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("C:\\File_writer_demo.txt");
		
		int i;
		
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
	}
}
