package vetores_matrizes;

import java.util.Scanner;

public class Ex_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double v[]= new Double[30], me=0.0, qtdA=0.0;
		String k="";
		for(int i=0;i<30;i++) {
			v[i]=s.nextDouble();
			me+=v[i];
		}
		me/=30;
		for(int i=0;i<30;i++) {
			if(v[i]>me)qtdA++;
			else if(v[i]<me)k+=i+" ";
		}
		System.out.println(me);
		System.out.println(qtdA);
		System.out.println(k);
	}
}
