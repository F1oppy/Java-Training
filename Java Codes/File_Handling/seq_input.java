package File_Handeling;

import java.io.*;

public class seq_input {
	public static void main(String[] args) throws IOException{
		FileInputStream f1 = new FileInputStream("C:\\byteArray.txt");
		FileInputStream f2 = new FileInputStream("C:\\testout.txt");
		
		SequenceInputStream si = new SequenceInputStream(f1,f2);
		
		int j;
		
		while((j=si.read())!=-1) {
			System.out.print((char)j);
		}
		si.close();
		f1.close();
		f2.close();
	}
}
