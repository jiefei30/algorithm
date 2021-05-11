package lanqiao.a2第七届国赛;

import java.util.Scanner;

/**
 * X星球的机器人表演拉拉队有两种服装，A和B。
他们这次表演的是搭机器人塔。

类似：

     A
    B B
   A B A
  A A B B
 B B B A B
A B A B B A

队内的组塔规则是：
  
  A 只能站在 AA 或 BB 的肩上。
  B 只能站在 AB 或 BA 的肩上。

你的任务是帮助拉拉队计算一下，在给定A与B的人数时，可以组成多少种花样的塔。

输入一行两个整数 M 和 N，空格分开（0<M,N<500）,分别表示A、B的人数，保证人数合理性。

要求输出一个整数，表示可以产生的花样种数。

例如：
用户输入：
1 2

程序应该输出：
3


再例如：
用户输入：
3 3

程序应该输出：
4

资源约定：
峰值内存消耗 < 256M
CPU消耗  < 1000ms
 * @author DELL
 *
 */
public class A4_机器人塔 {
	static int M;
	static int N;
	static int W;
	static int[][] map;
	static int count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		W = (int)(Math.sqrt(1+8*(M+N))+1)/2-1;
		map = new int[W][W];
		dfs(W-1,0);
		System.out.println(count);
	}
	public static void dfs(int row,int col) {
		if(M<0||N<0)return;
		if(col>row) {
			row--;
			col=0;
		}
		if(row == -1) count++;
		else if(row==W-1) {
			for(int i=0;i<2;i++) {
				if(i==0 && M>0) {
					M--;
					map[row][col]=1;
					dfs(row,col+1);
					map[row][col]=0;
					M++;
				}else if(i==1 && N>0) {
					N--;
					map[row][col]=2;
					dfs(row,col+1);
					map[row][col]=0;
					N++;
				}
			}
		}else {
			for(int i=0;i<2;i++) {
				if(i==0 && M>0 && (map[row+1][col]+map[row+1][col+1])%2==0) {
					M--;
					map[row][col]=1;
					dfs(row,col+1);
					map[row][col]=0;
					M++;
				}else if(i==1 && N>0 && (map[row+1][col]+map[row+1][col+1])==3) {
					N--;
					map[row][col]=2;
					dfs(row,col+1);
					map[row][col]=0;
					N++;
				}
			}
		}
	}
}
