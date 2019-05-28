package vetores_matrizes;

import java.util.Scanner;

public class Ex_7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double ve[] = { 51.0, 7.0, 1.0, 2.0, 7.0, 5.0, 816.0, 6.0, 11.0, 45.0, 57.0, 40.0, 41.0, 14.0, 97.0, 74.0, 14.0,
				54.0, 78.0, 98.0 };
		ve = Ex_6.booble(ve);
		System.out.println(PesquizaBinaria(ve, s.nextDouble()));
	}

	public static int PesquizaBinaria(Double a[], Double procura) {
		int esq = 0, dir = a.length - 1, mei;
		do {
			mei = esq + (dir - esq) / 2;
			if(procura<a[mei]) {
				dir=mei-1;
			}
			else if(procura>a[mei]) {
				esq=mei+1;
			}
			else {
				return mei;
			}
		} while (esq <= dir);
		return -1;
	}
}
