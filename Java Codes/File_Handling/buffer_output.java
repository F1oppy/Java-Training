package File_Handeling;

import java.io.*;

public class buffer_output {
	public static void main(String[] args) throws IOException {
			FileOutputStream fout = new FileOutputStream("C:\\testout.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			String s = "Buffered output demo";
			
			byte b[]=s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			System.out.println("Success!");
	}
}
