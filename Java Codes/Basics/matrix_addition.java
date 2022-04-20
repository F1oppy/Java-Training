package basics;
import java.util.*;

public class matrix_addition {
	public static void main(String[] args) {
		int r, c;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter row size: ");
		r = s.nextInt();
			
		System.out.println("Enter Column size: ");
		c = s.nextInt();
		
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int result[][]=new int[r][c];
		
		System.out.println("Enter Array values of First Matrix: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Enter Array values of Second Matrix: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				result [i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Result Matrix is: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
		s.close();
	}
}
