package File_Handeling;

import java.io.*;

public class char_arr {
	public static void main(String[] args) throws IOException {
		char arr[]= {'c','h','a','r','a','r','r','a','y'};
		
		CharArrayReader r = new CharArrayReader(arr);
		int k=0;
		
		while((k=r.read())!=-1) {
			char ch =(char)k;
			System.out.print(ch+":");
			System.out.println(k);
		}
		
	}
}
