package File_Handeling;

import java.io.*;

public class buffer_input {
	public static void main(String[] args) throws IOException {
			FileInputStream fis = new FileInputStream("C:\\testout.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			int i = 0;
			
			while((i=bis.read())!=-1){
				System.out.print((char)i);
			}
			bis.close();
	}
}
