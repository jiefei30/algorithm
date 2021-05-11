package lanqiao.a2第七届国赛;

import java.util.HashSet;

/**
 * 
反幻方

我国古籍很早就记载着

2 9 4
7 5 3
6 1 8

这是一个三阶幻方。每行每列以及对角线上的数字相加都相等。

下面考虑一个相反的问题。
可不可以用 1~9 的数字填入九宫格。
使得：每行每列每个对角线上的数字和都互不相等呢？


这应该能做到。
比如：
9 1 2
8 4 3
7 5 6

你的任务是搜索所有的三阶反幻方。并统计出一共有多少种。
旋转或镜像算同一种。

比如：
9 1 2
8 4 3
7 5 6

7 8 9
5 4 1
6 3 2

2 1 9
3 4 8
6 5 7

等都算作同一种情况。

请提交三阶反幻方一共多少种。这是一个整数，不要填写任何多余内容。
 * @author DELL
 *
 */
public class B2_反幻方 {
	static int count;
	static int[] arr = new int[9]; 
	static int[][] manage = {
			{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}	
	};
	public static void main(String[] args) {
		for(int i=0;i<9;i++) {
			arr[i]=i+1;
		}
		dfs(0);
		System.out.println(count/8);
	}
	public static void dfs(int k) {
		if(k==arr.length&&ok())count++;
		else {
			for(int i=k;i<arr.length;i++) {
				swap(k,i);
				dfs(k+1);
				swap(k,i);
			}
		}
	}
	public static void swap(int k,int i) {
		int t = arr[k];
		arr[k] = arr[i];
		arr[i] = t;
	}
	public static boolean ok() {
		HashSet<Integer> row = new HashSet<Integer>();
		int test =0;
		for(int i=0;i<8;i++) {
			test=0;
			for(int j=0;j<3;j++) {
				test+=arr[manage[i][j]];
			}
			row.add(test);
		}
		if(row.size()!=8)return false;
		else return true;
	}
}
