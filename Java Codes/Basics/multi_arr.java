package basics;
import java.util.*;

public class multi_arr {
	public static void main(String[] args) {
		int r, c;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter row size: ");
			r = s.nextInt();
			
		System.out.println("Enter Column size: ");
		c = s.nextInt();
		
		int x[][]=new int[r][c];
		System.out.println("Enter Array values: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				x[i][j]=s.nextInt();
			}
		}
		System.out.println("Matrix values are: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
		s.close();
	}
}
