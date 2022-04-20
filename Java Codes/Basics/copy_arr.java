package basics;
import java.util.*;

public class copy_arr {
	public static void main(String[] args) {
		int r, c;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter row size: ");
		r = s.nextInt();
			
		System.out.println("Enter Column size: ");
		c = s.nextInt();
		
		int a[][]=new int[r][c];
		int copy[][]=new int[r][c];
		
		System.out.println("Enter Array values of Original Matrix: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=s.nextInt();
			}
		}
		
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				copy [i][j]=a[i][j];
			}
		}
		
		System.out.println("Original Matrix is: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Copied Matrix is: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(copy[i][j]+"\t");
			}
			System.out.println();
		}
		s.close();
	}
}