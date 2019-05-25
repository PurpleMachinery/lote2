package vetores_matrizes;

import java.util.Scanner;

public class Ex_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = new int[50], med10_200=0, qtd10_200=0, numImp=0;
		for (int i = 0; i < 50; i++) {
			a[i] = s.nextInt();
			if(a[i]>10&&a[i]<200) {
				qtd10_200++;
				med10_200+=a[i];
			}
			if(a[i]%2!=0) {
				numImp+=a[i];
			}
		}
		System.out.println(med10_200/qtd10_200); //dá erro caso nao possua casos
		System.out.println(numImp);
	}
}
