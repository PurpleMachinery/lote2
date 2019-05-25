package vetores_matrizes;

import java.util.Scanner;

public class Ex_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Integer a[] = new Integer[100], ma, me, med;
		a[0]=s.nextInt();
		ma=a[0];
		me=a[0];
		med=a[0];
		for (int i = 1; i < 100; i++) {
			a[i] = s.nextInt();
			if(ma<a[i]) {
				ma=a[i];
			}
			if(me>a[i]) {
				me=a[i];
			}
			med+=a[i];
		}
		System.out.println(ma+" "+me);
		System.out.println(med/100);
	}
}
