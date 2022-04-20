package basics;

public class array_ex {
	public static void main(String args[]) {
		int a[]= new int[10];
		a[0]=1;
		a[1]=54;
		a[2]=21;
		a[3]=34;
		a[4]=76;
		a[5]=65;
		a[6]=73;
		a[7]=47;
		a[8]=90;
		a[9]=27;
		for(int i=0;i<10;i++) {
			System.out.println(i+"th index is "+a[i]);
		}
		System.out.println("Using for-each loop");
		for(int j:a) {
			System.out.println(j);
		}
	}
}
