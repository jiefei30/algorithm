package lanqiao.a1第六届国赛;

import java.util.Scanner;

/**
 * Pear有一个字符串，不过他希望把它切成两段。
这是一个长度为N（<=10^5）的字符串。
Pear希望选择一个位置，把字符串不重复不遗漏地切成两段，长度分别是t和N-t（这两段都必须非空）。

Pear用如下方式评估切割的方案：
定义“正回文子串”为：长度为奇数的回文子串。
设切成的两段字符串中，前一段中有A个不相同的正回文子串，后一段中有B个不相同的非正回文子串，则该方案的得分为A*B。

注意，后一段中的B表示的是：“...非正回文...”，而不是: “...正回文...”。
那么所有的切割方案中，A*B的最大值是多少呢？
【输入数据】
输入第一行一个正整数N（<=10^5）
接下来一行一个字符串，长度为N。该字符串仅包含小写英文字母。
【输出数据】
一行一个正整数，表示所求的A*B的最大值。
【样例输入】
10
bbaaabcaba
【样例输出】
38
【数据范围】
对于20%的数据，N<=100
对于40%的数据，N<=1000
对于100%的数据，N<=10^5

资源约定：
峰值内存消耗（含虚拟机） < 512M
CPU消耗  < 2000ms
 * @author DELL
 *
 */
public class A5_切开字符串 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String org = sc.next();
		int res=0,cur=0;
		for(int i=0;i<length;i++) {
			cur = divide(org.substring(0,i+1),org.substring(i+1));
			res = cur>res?cur:res;
		}
		System.out.println(res);
	}
	public static int divide(String left,String right) {
		int A=0,B=0;
		for(int i=0;i<left.length();i++) {
			for(int j=i+1;j<left.length();j++) {
				if(is(left.substring(i, j))) A++;
			}
		}
		for(int i=0;i<right.length();i++) {
			for(int j=i+1;j<right.length();j++) {
				if(!is(right.substring(i, j))) B++;
			}
		}	
		return A*B;
	}
	public static boolean is(String str) {
		if(str.length()%2==0) {
			return false;
		}else {
			for(int i=0;i<str.length()-1;i++) {
				if(str.charAt(i)!=str.charAt(str.length()-1)) return false;
			}
			return true;
		}
	}
}
