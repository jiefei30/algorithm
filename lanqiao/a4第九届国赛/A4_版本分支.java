package lanqiao.a4第九届国赛;

import java.util.Scanner;

/**
 * 小明负责维护公司一个奇怪的项目。这个项目的代码一直在不断分支(branch)但是从未发生过合并(merge)。
现在这个项目的代码一共有N个版本，编号1~N，其中1号版本是最初的版本。
除了1号版本之外，其他版本的代码都恰好有一个直接的父版本；即这N个版本形成了一棵以1为根的树形结构。  

如下图就是一个可能的版本树：

    1
   / \
  2   3
  |  / \
  5 4   6

现在小明需要经常检查版本x是不是版本y的祖先版本。你能帮助小明吗？

输入
----
第一行包含两个整数N和Q，代表版本总数和查询总数。  
以下N-1行，每行包含2个整数u和v，代表版本u是版本v的直接父版本。  
再之后Q行，每行包含2个整数x和y，代表询问版本x是不是版本y的祖先版本。  

对于30%的数据，1 <= N <= 1000  1 <= Q <= 1000  
对于100%的数据，1 <= N <= 100000  1 <= Q <= 100000  

输出
----
对于每个询问，输出YES或NO代表x是否是y的祖先。  

【样例输入】
6 5
1 2
1 3
2 5
3 6
3 4
1 1
1 4
2 6
5 2
6 4

【样例输出】
YES
YES
NO
NO
NO

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 1000ms
 * @author DELL
 *
 */
public class A4_版本分支 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[][] relation = new int[N-1][2];
		for(int i=0;i<N-1;i++) {
			relation[i][0] = sc.nextInt();
			relation[i][1] = sc.nextInt();
		}
		int[][] quest = new int[Q][2];
		for(int i=0;i<Q;i++) {
			quest[i][0] = sc.nextInt();
			quest[i][1] = sc.nextInt();
		}
		int p,c,p1;
		for(int i=0;i<Q;i++) {
			p = quest[i][0] ;
			c = quest[i][1];
			p1=c;
			if(p==1) System.out.println("YES");
			else {
				while(p1!=1) {
					c=p1;
					for(int j=0;j<N-1;j++) {
						if(relation[j][1]==c)p1=relation[j][0];
					}
					if(p1==1)System.out.println("NO");
					if(p1==p) {System.out.println("YES");break;}
				}
			}
		}
		
	}
}
