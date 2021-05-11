package lanqiao.a1第六届国赛;

import java.util.Scanner;

/**
 * 
 * 标题：奇怪的数列

从X星截获一份电码，是一些数字，如下：
13
1113
3113
132113
1113122113
....

YY博士经彻夜研究，发现了规律：
第一行的数字随便是什么，以后每一行都是对上一行“读出来”
比如第2行，是对第1行的描述，意思是：1个1，1个3，所以是：1113
第3行，意思是：3个1,1个3，所以是：3113

请你编写一个程序，可以从初始数字开始，连续进行这样的变换。

数据格式：

第一行输入一个数字组成的串，不超过100位
第二行，一个数字n，表示需要你连续变换多少次，n不超过20

输出一个串，表示最后一次变换完的结果。

例如：
用户输出：
5
7

则程序应该输出：
13211321322115
 * @author DELL
 *
 */
public class C4_奇怪的数列FALSE {
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		count = sc.nextInt();
		char[] b = a.toCharArray();
		String c="";
		int index=0;
		char u;
		int length=0;
		while(count>0) {
				c=""; 
			while(index<b.length) {
				u = b[index];
				length++;
				index++;
				if(index<b.length-1) {
					while(u==b[index]) {
						length++;
						if(index<b.length-1)index++;
					}
				}
				c+=length+""+u;
				length=0;
			}
			count--;
			b=c.toCharArray();
			index=0;
			length=0;
		}
		System.out.println(c);
	}
}
