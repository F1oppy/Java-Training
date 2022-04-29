package File_Handeling;

import java.io.*;

public class char_arr_writer {
	public static void main(String[] args) throws IOException {
		
		
		CharArrayWriter out = new CharArrayWriter();
		CharArrayWriter out1 = new CharArrayWriter();
		
		out.write("Character Array Writer Demo");
		out1.write("Character Array Writer Demo");
		
		FileWriter f1 = new FileWriter("C:\\file1.txt");
		FileWriter f2 = new FileWriter("C:\\file2.txt");
		FileWriter f3 = new FileWriter("C:\\file3.txt");
		FileWriter f4 = new FileWriter("C:\\file4.txt");
		
		out.writeTo(f1);
		out1.writeTo(f2);
		out.writeTo(f3);
		out.writeTo(f4);
		
		f1.close();f2.close();f3.close();f4.close();
		System.out.println("Success!");
		
		
	}
}
