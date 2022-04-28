package File_Handeling;

import java.io.*;

public class file_input_stream {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\byteArray.txt");
			int i = 0;
			
			while((i=fin.read())!=-1){
				System.out.print((char)i);
			}
			fin.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
