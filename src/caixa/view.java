package caixa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class view {
	private static ArrayList<Integer> valoresSacados;
	private static int notas[] = { 0, 0, 0, 0, 0, 0 }; // 100,50,20,10,5,2
	private static int valor[] = { 100, 50, 20, 10, 5, 2 };
	private static int bancos[] = { 0, 0, 0, 0, 0 };
	private static String nbancos[] = { "NaN", "Banco do Brasil", "Santander", "Itaú", "Caixa" };
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		while (true == true) {
			System.out.println("\n\n1 - Carregar Notas");
			System.out.println("2 - Retirar Notas");
			System.out.println("3 - Estatística");
			System.out.println("9 - Fim\n");
			System.out.print("Selecione: ");
			int a = s.nextInt();
			clearScr();
			switch (a) {
			case 1:
				load_notas();
				break;
			case 2:
				retirar_notas();
				break;
			case 3:
				show_stats();
				break;
			case 9:
				return;
			default:
				break;
			}
		}
	}

	public static void clearScr() {
		try {
			Runtime.getRuntime().exec("clear");
		} catch (Exception e) {
		}
	}

	public static void show_stats() {
		System.out.print("Notas: \n");
		for (int i = 0; i < 6; i++) {
			System.out.println(valor[i] + ": " + notas[i] + " ");
		}
		System.out.print("\nBancos: \n");
		for (int i = 0; i < 5; i++) {
			System.out.println(nbancos[i] + ": " + bancos[i] + " ");
		}
		Integer ma = null, me = null, qtd = 0, media, total = 0, mani;
		Iterator<Integer> z = null;
		try {
			z = valoresSacados.iterator();
			ma = z.next();
			me = ma;
			while (z.hasNext()) {
				qtd += 1;
				mani = z.next();
				if (ma < mani)
					ma = mani;
				if (me > mani)
					me = mani;
				total += mani;
			}
		} catch (Exception e) {
			qtd = null;
			total = null;
		}

		System.out.println("Maior Valor Sacado: " + ma);
		System.out.println("Menor Valor Sacado: " + me);
		try {
			System.out.println("Media: " + total / qtd);
		} catch (Exception e) {
			System.out.println("Media: " + 0);
		}
		System.out.println("Valor total: " + total);
		int all = 0;
		for (int i = 0; i < 6; i++) {
			all += notas[i] * valor[i];
		}
		System.out.println("Restante em Caixa: " + all);
	}

	public static void load_notas() {
		System.out.print("Digite a Nota a ser adicionada: ");
		int a = s.nextInt();
		System.out.print("Digite a Quantidade: ");
		int b = s.nextInt();
		for (; b > 0; b--) {
			switch (a) {
			case 100:
				notas[0]++;
				break;
			case 50:
				notas[1]++;
				break;
			case 20:
				notas[2]++;
				break;
			case 10:
				notas[3]++;
				break;
			case 5:
				notas[4]++;
				break;
			case 2:
				notas[5]++;
				break;
			default:
				break;
			}
		}
	}

	public static void retirar_notas() {
		int caixa = 0, a, valorSacado = 0, z = 0;
		do {
			caixa = 0;
			for (int i = 0; i < 6; i++) {
				caixa += notas[i] * valor[i];
			}
			System.out.print("Valor a ser retirado: R$ ");
			a = s.nextInt();
			if (a > caixa)
				System.out.println("EXCEDEU O LIMITE DO CAIXA");
		} while (a > caixa);
		if (a != 0) {
			if (notas[0] > 0) {
				System.out.print("\nNotas de 100 a ser sacados: ");
				z = s.nextInt();
			}
			while (notas[0] > 0 && a >= 100) {
				notas[0]--;
				valorSacado += 100;
				a -= 100;
			}
			if (notas[1] > 0) {
				System.out.print("\nNotas de 50 a ser sacados: ");
				z = s.nextInt();
			}
			while (notas[1] > 0 && a >= 50) {
				notas[1]--;
				valorSacado += 50;
				a -= 50;
			}
			if (notas[2] > 0) {
				System.out.print("\nNotas de 20 a ser sacados: ");
				z = s.nextInt();
			}
			while (notas[2] > 0 && a >= 20) {
				notas[2]--;
				valorSacado += 20;
				a -= 20;
			}
			if (notas[3] > 0) {
				System.out.print("\nNotas de 10 a ser sacados: ");
				z = s.nextInt();
			}
			while (notas[3] > 0 && a >= 10) {
				notas[3]--;
				valorSacado += 10;
				a -= 10;
			}
			if (notas[4] > 0) {
				System.out.print("\nNotas de 5 a ser sacados: ");
				z = s.nextInt();
			}
			while (notas[4] > 0 && a >= 5) {
				notas[4]--;
				valorSacado += 5;
				a -= 5;
			}
			if (notas[5] > 0) {
				System.out.print("\nNotas de 2 a ser sacados: ");
				z = s.nextInt();
			}
			while (notas[5] > 0 && a >= 2) {
				notas[5]--;
				valorSacado += 2;
				a -= 2;
			}
			System.out.println("Valor Total sacado: R$ " + valorSacado);
			valoresSacados.add(valorSacado);
		}
	}
}
