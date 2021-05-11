package other.模拟赛;

import java.io.Reader;
import java.util.Scanner;

public class MainK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		long  total=1;
		if(n<8) {
			for(int i=0;i<n;i++) {
				total=2*total;
			}
		}else {
			int a =(int)(n/8);
			int b =n%8;
			for(int i=0;i<a;i++) {
				total=256*total;
				if(total>20180520) {
					total=total%20180520;
				}
			}
			for(int i=0;i<b;i++) {
				total=2*total;
				if(total>20180520) {
					total=total%20180520;
				}
			}
		}
		System.out.println(total);
	}
}
