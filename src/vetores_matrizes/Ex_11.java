package vetores_matrizes;

public class Ex_11 {
	public static void main(String[] args) {
		int m[][] = new int[8][8], x = 8, y = 8, a=0;
		for (int z = 1; z < 8; z++) {
			for (int i = a; i < x; i++) {
				for (int j = a; j < y; j++) {
					m[i][j] = z;
				}
			}
			x--;
			y--;
			a++;
		}
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}