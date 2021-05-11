package lanqiao.a3第八届国赛;

import java.util.Scanner;

/**
 * 小明喜欢在一个围棋网站上找别人在线对弈。这个网站上所有注册用户都有一个积分，代表他的围棋水平。

小明发现网站的自动对局系统在匹配对手时，只会将积分差恰好是K的两名用户匹配在一起。如果两人分差小于或大于K，系统都不会将他们匹配。

现在小明知道这个网站总共有N名用户，以及他们的积分分别是A1, A2, ... AN。

小明想了解最多可能有多少名用户同时在线寻找对手，但是系统却一场对局都匹配不起来(任意两名用户积分差不等于K)？  

输入
----
第一行包含两个个整数N和K。
第二行包含N个整数A1, A2, ... AN。  

对于30%的数据，1 <= N <= 10
对于100%的数据，1 <= N <= 100000, 0 <= Ai <= 100000, 0 <= K <= 100000

输出
----
一个整数，代表答案。

样例输入：
10 0
1 4 2 8 5 7 1 4 2 8

样例输出：
6


 * @author DELL
 *
 */
public class A5_对局匹配 {
	public static void main(String[] args) {
		int resalt = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n+1];
		for(int i=0;i<n;i++) {
			a[sc.nextInt()]++;
		}
		if(k>=n) {
			resalt=n;
		}
		else if(k==0) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=0) resalt++;
			}
		}
		else 
		{
			int[] buf = new int[n/k+2];
			int[] dp = new int[n/k+2];
			for(int i=0;i<k;i++)
			{
				int len = 1;
				for(int j=i;j<n+1;j+=k)
				{
					buf[len++] = a[j];
				}
				dp[0] = 0;
				dp[1] = buf[1];
				for(int j=2;j<len;j++) 
				{
					dp[j] = Math.max(dp[j-1], dp[j-2]+buf[j]);
				}
				resalt += dp[len-1];
			}
		}
		System.out.println(resalt);
	}

}
