package lanqiao.a入门训练;
/**
 * 
 * Fibonacci数列
 */
import java.util.Scanner;

public class 斐波那契数列 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=1,b=1,Fn=0;
		for(int i=2;i<n;i++) {
			Fn=(a+b)%10007;
			a=b;
			b=Fn;
		}
		if(n<3) {
			System.out.println(1);
		}else
		System.out.println(Fn);
	}
}
