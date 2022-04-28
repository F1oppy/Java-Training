package File_Handeling;

import java.io.*;

public class byte_array {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\byteArray.txt");
			String s = "Welcome to Java Stream!";
			
			byte b[]= s.getBytes(); 	//Converting the String to byte so that we can write it in the file
			
			fout.write(b);
			fout.close();
			System.out.println("Success");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}