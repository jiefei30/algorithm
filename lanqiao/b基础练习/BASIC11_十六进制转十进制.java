package lanqiao.b基础练习;

import java.util.Scanner;

/**
 * 问题描述
　　从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
　　注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
样例输入
FFFF
样例输出
65535
 * @author DELL
 *
 */
public class BASIC11_十六进制转十进制 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sixteen = sc.next();
		long ten = 0;
		for(int i=0;i<sixteen.length();i++) {
			switch(sixteen.charAt(i)) {
			case '0':ten+=0;break;
			case '1':ten+=1*Math.pow(16, (sixteen.length()-1-i));break;
			case '2':ten+=2*Math.pow(16, (sixteen.length()-1-i));break;
			case '3':ten+=3*Math.pow(16, (sixteen.length()-1-i));break;
			case '4':ten+=4*Math.pow(16, (sixteen.length()-1-i));break;
			case '5':ten+=5*Math.pow(16, (sixteen.length()-1-i));break;
			case '6':ten+=6*Math.pow(16, (sixteen.length()-1-i));break;
			case '7':ten+=7*Math.pow(16, (sixteen.length()-1-i));break;
			case '8':ten+=8*Math.pow(16, (sixteen.length()-1-i));break;
			case '9':ten+=9*Math.pow(16, (sixteen.length()-1-i));break;
			case 'A':ten+=10*Math.pow(16, (sixteen.length()-1-i));break;
			case 'B':ten+=11*Math.pow(16, (sixteen.length()-1-i));break;
			case 'C':ten+=12*Math.pow(16, (sixteen.length()-1-i));break;
			case 'D':ten+=13*Math.pow(16, (sixteen.length()-1-i));break;
			case 'E':ten+=14*Math.pow(16, (sixteen.length()-1-i));break;
			case 'F':ten+=15*Math.pow(16, (sixteen.length()-1-i));break;
			}
		}
		System.out.println(ten);
	}
}
