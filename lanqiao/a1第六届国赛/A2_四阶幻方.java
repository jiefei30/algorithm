package lanqiao.a1第六届国赛;

import java.util.HashSet;

/**
 * 
 * 标题：四阶幻方

把1~16的数字填入4x4的方格中，使得行、列以及两个对角线的和都相等，满足这样的特征时称为：四阶幻方。

四阶幻方可能有很多方案。如果固定左上角为1，请计算一共有多少种方案。
比如：
  1  2 15 16
 12 14  3  5
 13  7 10  4
  8 11  6  9

以及：
  1 12 13  8       1  12  13  8  2  14  7  11  15  3  10  6  16  5  4  9
  2 14  7 11	   0  1   2   3  4  5   6   7   8  9  10  11  12 13 14 15
 15  3 10  6
 16  5  4  9
 
就可以算为两种不同的方案。

请提交左上角固定为1时的所有方案数字，不要填写任何多余内容或说明文字。
 * @author DELL
 *
 */
public class A2_四阶幻方 {
	static int res=34;
	static int count;
	static int test2=0;
	static int[] arr = new int[16]; 
	static int[][] manage = {
			{0,1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14,15},{0,4,8,12},{1,5,9,13},{2,6,10,14},{3,7,11,15},{0,5,10,15},{3,6,9,12}	
	};
	public static void main(String[] args) {
		for(int i=0;i<16;i++) {
			arr[i]=i+1;
		}
		dfs(1);
		System.out.println(count);
	}
	public static void dfs(int k) {
		if(k%4==0 && k>3) {
			test2=0;
			for(int i=k-4;i<k;i++) {
				test2+=arr[i];
			}
			if(test2!=34)return;
		}
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
		int test =0;
		for(int i=4;i<10;i++) {
			test=0;
			for(int j=0;j<4;j++) {
				test+=arr[manage[i][j]]; 
			}
			if(test!=34)return false; 
		}
		return true;
	}
}
