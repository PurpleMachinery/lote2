package vetores_matrizes;

public class Ex_9 {
	public static void main(String[] args) {
		double v[][]=new double[4][4], pot=1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==j) {
					v[i][j]=pot;
					pot*=4;
				}
				else {
					v[i][j]=Math.ceil(Math.random()*10);
				}
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(v[i][j]+" ");
			}
			System.out.println();
		}
	}
}
