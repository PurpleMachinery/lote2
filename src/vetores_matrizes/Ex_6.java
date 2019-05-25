package vetores_matrizes;

public class Ex_6 {
	public static void main(String[] args) {
		Double a[]=new Double[5];
		for(int i=0;i<5;i++) {
			a[i]=Math.round(Math.random()*100)*1.0;
			a[i]+=Math.round(Math.random()*10)*1.0;
		}
		a=booble(a);
		for(Double kk:a) {
			System.out.println(kk);
		}
	}
	public static Double[] booble(Double a[]) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				Double kk = a[i];
				a[i+1]=a[i];
				a[i]=kk;
			}
		}
		return a;
	}
}
