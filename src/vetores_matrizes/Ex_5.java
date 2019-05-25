package vetores_matrizes;

import java.util.Scanner;

public class Ex_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[]=new int[20];
		for(int i=0;i<20;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<10;i++) {
			System.out.println(a[i]-a[19-i]);
		}
	}
}
