package File_Handeling;

import java.io.*;

public class obj_input_stream {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\student.txt"));
		
		stu s =(stu)in.readObject();
		System.out.println(s.regno+" "+s.name);
	}
}
