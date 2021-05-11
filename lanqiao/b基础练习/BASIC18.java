package lanqiao.b基础练习;

import java.util.Scanner;

/**
 * 矩形面积交
 * @author DELL
 *
 */
public class BASIC18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] x = new double[4];
		double[] y = new double[4];
		for(int i=0;i<4;i++) {
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
		}
		change(x);
		change(y);
		System.out.printf("%.2f",cha(x)*cha(y));
	}
	public static void change(double[] a) {
		double t;
		for(int i=0;i<4;) {
			if(a[i]>a[i+1]) {
				t=a[i];
				a[i]=a[i+1];
				a[i+1] = t;
			}
			i+=2;
		}
	}
	public static double cha(double[] a) {
		double cha=0;
		if(a[0]<a[2]) {
			if(a[1]>=a[3])cha=a[3]-a[2];
			else if(a[1]>a[2]) cha=a[1]-a[2];
		}else if(a[0]<a[3]) {
			if(a[1]<a[3]) cha = a[1]-a[0];
			else if(a[1]>=a[3]) cha = a[3] - a[0];
		}
		return cha;
	}
}
