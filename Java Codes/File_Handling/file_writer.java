package File_Handeling;

import java.io.*;

public class file_writer {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\File_writer_demo.txt");
			fw.write("Data Written using FileWriter");
			fw.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Success!");
	}
}
