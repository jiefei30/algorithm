package lanqiao.c算法训练;
/**
 * (幂方分解
 * 问题描述
　　任何一个正整数都可以用2的幂次方表示。例如：
　　137=27+23+20 
　　同时约定方次用括号来表示，即ab 可表示为a（b）。
　　由此可知，137可表示为：
　　2（7）+2（3）+2（0）
　　进一步：7= 22+2+20 （21用2表示）
　　3=2+20 
　　所以最后137可表示为：
　　2（2（2）+2+2（0））+2（2+2（0））+2（0）
　　又如：
　　1315=210 +28 +25 +2+1
　　所以1315最后可表示为：
　　2（2（2+2（0））+2）+2（2（2+2（0）））+2（2（2）+2（0））+2+2（0）
输入格式
　　输入包含一个正整数N（N<=20000），为要求分解的整数。
输出格式
　　程序输出包含一行字符串，为符合约定的n的0，2表示（在表示中不能有空格）
 */
import java.util.Scanner;


public class ALGO_012_幂方分解 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(transform(sc.nextInt()));
	}
	public static String transform(int number) {
		String str1="";
		int mi=0;	
		int yu=0;
		if(number>2) {
			int current=2;
			for(;current<=number;mi++) {
				current = current*2;
			}	
			yu = number-current/2;
			if(mi==1)str1= "2";
			else str1="2("+transform(mi)+")";
		}else {
			if(number==0)return "";
			else if(number==1)return "2(0)";
			else if(number==2) return "2";
		}
		if(yu==0) return str1;
		else return str1+"+"+transform(yu);
	}
}