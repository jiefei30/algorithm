package lanqiao.b基础练习;
/**
 *  基础练习 高精度加法  
 */
import java.util.Scanner;

public class BASIC_29_高精度加法 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b = sc.next();
		char[] charA = a.toCharArray();
		char[] charB = b.toCharArray();
		int[] A = new int[a.length()];
		int[] B = new int[b.length()];
		for(int i=0;i<a.length();i++) {
			A[i] = Integer.parseInt(charA[i]+"");
		}
		for(int i=0;i<b.length();i++) {
			B[i] = Integer.parseInt(charB[i]+"");
		}
		int[] max,min,min2;
		if(a.length()==b.length()) {
			max = B;
			min = A;
		}else {
			if(a.length()>b.length()) {
				max = A;
				min2 = B;
			}else {
				max = B;
				min2 = A;
			}
			min =new int[max.length];
			for(int i=0;i<min2.length;i++) {
				min[min.length-1-i] = min2[min2.length-1-i];
			}
		}
		int sum;
		int ten = 0;
		for(int i=0;i<min.length;i++) {
			sum = max[max.length-1-i] + min[min.length-1-i] +ten;
			if(sum>9) {
				max[max.length-1-i] = (sum-10);
				ten = 1;
			}else {
				max[max.length-1-i] =sum;
				ten=0;
			}
		}
		if(ten==1) {
			System.out.print(1);
		}
		for(int i=0;i<max.length;i++) {
			System.out.print(max[i]);
		}
	}
}
