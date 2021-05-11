package lanqiao.a1第六届国赛;
/**
 * 标题：五星填数

如【图1.png】的五星图案节点填上数字：1~12，除去7和11。
要求每条直线上数字和相等。

如图就是恰当的填法。

请你利用计算机搜索所有可能的填法有多少种。
注意：旋转或镜像后相同的算同一种填法。

 */
import java.util.ArrayList;

public class B2_五星填数 {
	static int count=0;
	static int[] arr = new int[10]; 
	static int[][] line = {{0,5,6,2},{1,5,9,4},{1,6,7,3},{2,7,8,4}};
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i<6) arr[i]=i+1;
			else arr[i]=i+2;
		}
		arr[9]=12;
		dfs(0);
		System.out.println(count/10);
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
		int res = arr[0]+arr[9]+arr[8]+arr[3];
		int test =0;
		for(int i=0;i<4;i++) {
			test=0;
			for(int j=0;j<4;j++) {
				test+=arr[line[i][j]]; 
			}
			if(test!=res)return false; 
		}
		return true;
	}
}
