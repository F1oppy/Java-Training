package File_Handeling;

import java.io.*;

public class file_output_stream {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\filedemo1.txt");
			fout.write(68);
			fout.close();
			System.out.println("Success");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
