package vetores_matrizes;

public class Ex_10 {
	public static void main(String[] args) {
		int m[][]=new int[8][8], a=1;
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				m[i][j]=a;
				a*=2;
			}
		}
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
}
