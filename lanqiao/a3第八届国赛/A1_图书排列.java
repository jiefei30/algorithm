package lanqiao.a3第八届国赛;

import java.util.HashSet;

/**
 * 将编号为1~10的10本书排放在书架上，要求编号相邻的书不能放在相邻的位置。
请计算一共有多少种不同的排列方案。
 * @author DELL
 *
 */
public class A1_图书排列 {
	static int count;
	static int[] arr = new int[10]; 
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			arr[i]=i+1;
		}
		dfs(0);
		System.out.println(count);
	}
	public static void dfs(int k) {
		if(k==arr.length && ok())count++;
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
		for(int i=0;i<9;i++) {
			if(arr[i]==arr[i+1]-1 ||arr[i]==arr[i+1]+1) return false;
		}
		return true;
	}
}
