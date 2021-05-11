package lanqiao.c算法训练;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 问题描述
　　若一个数（首位不为零）从左向右读与从右向左读都一样，我们就将其称之为回文数。
　　例如：给定一个10进制数56，将56加65（即把56从右向左读），得到121是一个回文数。

　　又如：对于10进制数87：
　　STEP1：87+78 = 165 STEP2：165+561 = 726
　　STEP3：726+627 = 1353 STEP4：1353+3531 = 4884

　　在这里的一步是指进行了一次N进制的加法，上例最少用了4步得到回文数4884。

　　写一个程序，给定一个N（2<=N<=10或N=16）进制数M（其中16进制数字为0-9与A-F），求最少经过几步可以得到回文数。
　　如果在30步以内（包含30步）不可能得到回文数，则输出“Impossible!”
	输入格式
　　两行，N与M
	输出格式
　　如果能在30步以内得到回文数，输出“STEP=xx”（不含引号），其中xx是步数；否则输出一行”Impossible!”（不含引号）
样例输入
9
87
样例输出
STEP=6
 * @author DELL
 *
 */
public class ALGO_014_回文数 {
	static int jinzhi;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		jinzhi = sc.nextInt();
		BigInteger a =new BigInteger(String.valueOf(sc.next()),jinzhi);
		int step=1;
		for(;step<=30;step++) {
			if(isHuiwen(a.add(turn(a)))) {
				System.out.println(step);
				break;
			}else {
				a = a.add(turn(a));
			}
		}
		if(step==31) System.out.println("Impossible!");
	}
	public static boolean isHuiwen(BigInteger a) {
		String str = new BigInteger(String.valueOf(a),10).toString(jinzhi);
		System.out.println(str);
		int b = (str.length()-str.length()%2)/2;
		for(int i=0;i<b;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) return false;
		}
		return true;
	}
	public static BigInteger turn(BigInteger a) {
		String str = new BigInteger(String.valueOf(a),10).toString(jinzhi);
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res+=str.charAt(i)+"";
		}
		return new BigInteger(String.valueOf(res),jinzhi);
	}
}
