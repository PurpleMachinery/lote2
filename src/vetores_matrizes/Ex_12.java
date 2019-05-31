package vetores_matrizes;

public class Ex_12 {
	public static void main(String[] args) {
		int v[] = new int[8];
		int xad[][]= 
			{
					{2,4,3,6,5,3,4,2},
					{1,1,1,1,1,1,1,1},
					{7,7,7,7,7,7,7,7},
					{7,7,7,7,7,7,7,7},
					{7,7,7,7,7,7,7,7},
					{7,7,7,7,7,7,7,7},
					{1,1,1,1,1,1,1,1},
					{2,4,3,6,5,3,4,2}
			}
				;
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				v[xad[i][j]]++;
			}
		}
		for(int k=1;k<v.length;k++) {
			System.out.println(v[k]);
		}
	}
}
