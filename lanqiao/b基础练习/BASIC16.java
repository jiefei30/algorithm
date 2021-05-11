package lanqiao.b基础练习;

import java.util.Scanner;

/**
 * 分解质因数
 * @author DELL
 *
 */
public class BASIC16 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(;a<=b;a++) {
			System.out.print(a+"=");
			factor(a);
		}
	}
	static void factor(int number){
		int t=isPrime(number);
		if(t==0) System.out.println(number);
		else {
			System.out.print(t+"*");
			factor(number/t);
		}
	}

	static int isPrime(int number){
		int res=0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				return i;
			}
		}
		return res;
	}
}
