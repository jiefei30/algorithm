package lanqiao.b基础练习;
/**
 * 问题描述
　　回文串，是一种特殊的字符串，它从左往右读和从右往左读是一样的。小龙龙认为回文串才是完美的。现在给你一个串，它不一定是回文的，请你计算最少的交换次数使得该串变成一个完美的回文串。
　　交换的定义是：交换两个相邻的字符
　　例如mamad
　　第一次交换 ad : mamda
　　第二次交换 md : madma
　　第三次交换 ma : madam (回文！完美！)
输入格式
　　第一行是一个整数N，表示接下来的字符串的长度(N <= 8000)
　　第二行是一个字符串，长度为N.只包含小写字母
输出格式
　　如果可能，输出最少的交换次数。
　　否则输出Impossible
样例输入
5
mamad
样例输出
3
 */
import java.util.Scanner;

public class BASIC19_2_完美的代价 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		String s = sc.next();
		char[] a = s.toCharArray();
		int[] b = new int[26];
		for(int i=0;i<l;i++) {
			b[(int)s.charAt(i)-'a']++;
		}
		System.out.println(b[6]+" "+b[25]);
		int k=0;
		for(int i=0;i<26;i++)
		{
			if(b[i]%2!=0)
				k++;
		}
		if(k>2) {
			System.out.println("Impossible");
		}else {
			//h计形成回文所需次数，
			//m计奇数字符串时，奇数字母到达中点位置所需次数
			//g用于改变交换位置长度
			int h=0,g=l,m=0;
			for(int i=0;i<(l+1)/2;i++)
			{
				int j;
				//查找是否存在不同位置的相同字母
				for(j=g-1;j>i;j--)
				{
					//存在
					if(a[i]==a[j])
					{
						while(j<g-1)
						{
							//交换至对应位置
							char t;
							t=a[j];
							a[j]=a[j+1];
							a[j+1]=t;
							j++;
							h++;//记录次数
						}
						g--;
						break;
					}
				}
				//不存在，则为奇数字母
				if(j==i) m=(l-1)/2-i;
			}
			System.out.println(h+m);
		}

	}
}
