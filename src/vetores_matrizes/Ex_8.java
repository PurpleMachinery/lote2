package vetores_matrizes;

public class Ex_8 {
	public static void main(String[] args) {
		int ma[][]= {
				{5,6,8},
				{1,5,3},
				{2,6,7},
				{5,5,4}};
		int a[]= {0,0,0};	//a
		int b[]= {0,0,0,0};	//b
		int c=0;				//c
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				a[i]+=ma[j][i];
				b[j]+=ma[j][i];
				c+=ma[j][i];
			}
		}
		for(int i=0;i<3;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<4;i++) {
			System.out.println(b[i]);
		}
		System.out.println(c);
	}
}
