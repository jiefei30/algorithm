package lanqiao.a2第七届国赛;

import java.util.Scanner;

/**
 * 
 * 某机构举办球票大奖赛。获奖选手有机会赢得若干张球票。

主持人拿出 N 张卡片（上面写着 1~N 的数字），打乱顺序，排成一个圆圈。
你可以从任意一张卡片开始顺时针数数: 1,2,3.....
如果数到的数字刚好和卡片上的数字相同，则把该卡片收入囊中，从下一个卡片重新数数。
直到再无法收获任何卡片，游戏结束。囊中卡片数字的和就是赢得球票的张数。

比如：
卡片排列是：1 2 3
我们从1号卡开始数，就把1号卡拿走。再从2号卡开始，但数的数字无法与卡片对上，
很快数字越来越大，不可能再拿走卡片了。因此这次我们只赢得了1张球票。

还不算太坏！如果我们开始就傻傻地从2或3号卡片数起，那就一张卡片都拿不到了。

如果运气好，卡片排列是 2 1 3
那我们可以顺利拿到所有的卡片！

本题的目标就是：已知顺时针卡片序列。
随便你从哪里开始数，求最多能赢多少张球票（就是收入囊中的卡片数字之和）

输入数据：
第一行一个整数N(N<100)，表示卡片数目
第二行 N 个整数，表示顺时针排列的卡片

输出数据：
一行，一个整数，表示最好情况下能赢得多少张球票

比如：
用户输入：
3
1 2 3

程序应该输出：
1

比如：
用户输入：
3
2 1 3

程序应该输出：
6


资源约定：
峰值内存消耗 < 256M
CPU消耗  < 1000ms

 * @author DELL
 *
 */
public class C4_赢球票 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  N = sc.nextInt();
		int[] arr1 = new int[N];
		int max=0;
		for(int i=0;i<N;i++) {
			arr1[i] = sc.nextInt();
			max = max<arr1[i]?arr1[i]:max;
		}
		int count,index,res=0,cur=0,a=0;
		for(int i=0;i<N;i++) {
			System.out.println("第："+i);
			count=1;
			index=i;
			cur=0;
			a=0;
			int[] arr = arr1.clone(); 
			while(count<=max) {
				System.out.println(cur);
				if(arr[index]!=0) {
					if(count==arr[index]) {
						cur+=arr[index];
						arr[index]=0;
						count=1;
					}else count++;
					a=0;
				}
				index++;
				a++;
				if(index==N) index=0;
				if(a>N) break;
			}
			res = cur<res?res:cur;
		}
		System.out.println(res);
	}
}
