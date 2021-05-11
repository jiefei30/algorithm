package lanqiao_GBK.b基础练习

������ϰ;

import java.util.Scanner;

/**
 * 
 * �Ա��ַ���
 *
 */
public class BASIC15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if(str1.length()!=str2.length()){
			System.out.println(1);
		}else if(!str1.toUpperCase().equals(str2.toUpperCase())) {
			System.out.println(4);
		}else if(str1.equals(str2)) {
			System.out.println(2);
		}else if(str1.toUpperCase().equals(str2.toUpperCase())) {
			System.out.println(3);
		}
	}
}
