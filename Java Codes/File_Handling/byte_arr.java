package File_Handeling;

import java.io.*;

public class byte_arr {
	public static void main(String[] args) throws Exception {
		FileOutputStream f1 = new FileOutputStream("C:\\f1.txt");
		FileOutputStream f2 = new FileOutputStream("C:\\f2.txt");
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		
		bout.write(65);
		bout.writeTo(f1);
		bout.writeTo(f2);
		
		bout.close();
		System.out.println("Success!");
	}
}
