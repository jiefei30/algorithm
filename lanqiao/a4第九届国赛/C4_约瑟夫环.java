package lanqiao.a4第九届国赛;

import java.util.Scanner;

/**
 * 约瑟夫环

n 个人的编号是 1~n，如果他们依编号按顺时针排成一个圆圈，从编号是1的人开始顺时针报数。
（报数是从1报起）当报到 k 的时候，这个人就退出游戏圈。下一个人重新从1开始报数。
求最后剩下的人的编号。这就是著名的约瑟夫环问题。

本题目就是已知 n，k 的情况下，求最后剩下的人的编号。

题目的输入是一行，2个空格分开的整数n, k
要求输出一个整数，表示最后剩下的人的编号。

约定：0 < n,k < 1百万

例如输入：
10 3

程序应该输出：
4

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 1000ms

 * @author DELL
 *
 */
public class C4_约瑟夫环 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = i+1;
		}
		int count=0,index=0;
		while(n>1) {
			if(arr[index]!=0) {
				count++;
				if(count==k) {
					arr[index]=0;
					count=0;
					n--;
				}
			}
			if(index==arr.length-1)index=0;
			else index++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0)System.out.println(i+1);
		}
	}
}
