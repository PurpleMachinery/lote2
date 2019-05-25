package vetores_matrizes;

public class Ex_3 {
	public static void main(String[] args) {
		int VT1[]= {1,2,3}, VT2[]= {4,5,6}, VT3[]= {VT1[0],VT1[1],VT1[2],VT2[0],VT2[1],VT2[2]};
		for(int k : VT3) {
			System.out.println(k);
		}
	}
}
