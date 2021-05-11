package lanqiao.a3第八届国赛;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 小明的实验室有N台电脑，编号1~N。原本这N台电脑之间有N-1条数据链接相连，恰好构成一个树形网络。在树形网络上，任意两台电脑之间有唯一的路径相连。

不过在最近一次维护网络时，管理员误操作使得某两台电脑之间增加了一条数据链接，于是网络中出现了环路。环路上的电脑由于两两之间不再是只有一条路径，使得这些电脑上的数据传输出现了BUG。

为了恢复正常传输。小明需要找到所有在环路上的电脑，你能帮助他吗？

输入
-----
第一行包含一个整数N。
以下N行每行两个整数a和b，表示a和b之间有一条数据链接相连。

对于30%的数据，1 <= N <= 1000
对于100%的数据, 1 <= N <= 100000， 1 <= a, b <= N

输入保证合法。

输出
----
按从小到大的顺序输出在环路上的电脑的编号，中间由一个空格分隔。


样例输入：
5
1 2
3 1
2 4
2 5
5 3

样例输出：
1 2 3 5
 * @author DELL
 *
 */
public class A4_发现环 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] graph = new int[N][2];
		int a,b,c=0;
		HashSet<Integer> hset = new HashSet<Integer>();
		for(int i=0;i<N;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a>b) {
				graph[i][0] = b;
				graph[i][1] = a;
			}else {
				graph[i][0] = a;
				graph[i][1] = b;
			}
			hset.add(graph[i][1]);
			if(hset.size()!=i+1) c = graph[i][1];
		}
		ArrayList<Integer> path = new ArrayList<Integer>();
		int p1=0,p2=0,c1,c2;
		for(int i=0,j=0;i<N;i++) {
			if(graph[i][1]==c) {
				if(j==0) {
					p1=graph[i][0];
					graph[i][1] = 0;
					j++;
				}else {
					p2 = graph[i][0];
					graph[i][1]=0;
					break;
				}
			}
		}
		path.add(c);
		path.add(p1);
		path.add(p2);
		while(p1!=p2) {
			c1=p1;
			c2=p2;
			for(int i=0,j=0;i<N&&j<2;i++) {
				if(graph[i][1]==0) continue;
				else {
					if(graph[i][1]==c1) {
						p1 = graph[i][0];
						j++;
					}else if(graph[i][1]==c2) {
						p2 = graph[i][0];
						j++;
					}
				}
				graph[i][1]=0;
			}
			path.add(p1);
			path.add(p2);
		}
		path.remove(path.size()-1);
		int[] res = new int[path.size()];
		for(int i=0;i<path.size();i++) {
			res[i] = path.get(i);
		}
		Arrays.sort(res);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
}
