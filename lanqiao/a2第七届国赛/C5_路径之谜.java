package lanqiao.a2第七届国赛;

import java.util.Scanner;

/**路径之谜

小明冒充X星球的骑士，进入了一个奇怪的城堡。
城堡里边什么都没有，只有方形石头铺成的地面。

假设城堡地面是 n x n 个方格。【如图1.png】所示。

按习俗，骑士要从西北角走到东南角。
可以横向或纵向移动，但不能斜着走，也不能跳跃。
每走到一个新方格，就要向正北方和正西方各射一箭。
（城堡的西墙和北墙内各有 n 个靶子）


同一个方格只允许经过一次。但不必做完所有的方格。

如果只给出靶子上箭的数目，你能推断出骑士的行走路线吗？

有时是可以的，比如图1.png中的例子。

本题的要求就是已知箭靶数字，求骑士的行走路径（测试数据保证路径唯一）

输入：
第一行一个整数N(0<N<20)，表示地面有 N x N 个方格
第二行N个整数，空格分开，表示北边的箭靶上的数字（自西向东）
第三行N个整数，空格分开，表示西边的箭靶上的数字（自北向南）

输出：
一行若干个整数，表示骑士路径。

为了方便表示，我们约定每个小格子用一个数字代表，从西北角开始编号: 0,1,2,3....
比如，图1.png中的方块编号为：

0  1  2  3
4  5  6  7
8  9  10 11
12 13 14 15


示例：
用户输入：
4
2 4 3 4
4 3 3 3

程序应该输出：
0 4 5 1 2 3 7 11 10 9 13 14 15路径之谜

小明冒充X星球的骑士，进入了一个奇怪的城堡。
城堡里边什么都没有，只有方形石头铺成的地面。

假设城堡地面是 n x n 个方格。【如图1.png】所示。

按习俗，骑士要从西北角走到东南角。
可以横向或纵向移动，但不能斜着走，也不能跳跃。
每走到一个新方格，就要向正北方和正西方各射一箭。
（城堡的西墙和北墙内各有 n 个靶子）


同一个方格只允许经过一次。但不必做完所有的方格。

如果只给出靶子上箭的数目，你能推断出骑士的行走路线吗？

有时是可以的，比如图1.png中的例子。

本题的要求就是已知箭靶数字，求骑士的行走路径（测试数据保证路径唯一）

输入：
第一行一个整数N(0<N<20)，表示地面有 N x N 个方格
第二行N个整数，空格分开，表示北边的箭靶上的数字（自西向东）
第三行N个整数，空格分开，表示西边的箭靶上的数字（自北向南）

输出：
一行若干个整数，表示骑士路径。

为了方便表示，我们约定每个小格子用一个数字代表，从西北角开始编号: 0,1,2,3....
比如，图1.png中的方块编号为：

0  1  2  3
4  5  6  7
8  9  10 11
12 13 14 15


示例：
用户输入：
4
2 4 3 4
4 3 3 3

程序应该输出：
0 4 5 1 2 3 7 11 10 9 13 14 15
 * 
 * @author DELL
 *
 */
public class C5_路径之谜 {
	static int n;
	static int count;
	static int[] north;
	static int[] west;
	static int[] path;
	static int[][] map;
	static int[] curNorth;
	static int[] curWest;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int step = 0;
		n = sc.nextInt();
		north = new int[n];
		west = new int[n];
		for(int i=0;i<n;i++) north[i] = sc.nextInt();
		for(int i=0;i<n;i++) {
			west[i] = sc.nextInt();
			step+=west[i];
		}
		path = new int[step];
		map = new int[n][n];
		curNorth = new int[n];
		curWest = new int[n];
		dfs(0,0);
		
	}
	public static void dfs(int x,int y) {
		if(map[x][y]!=1) {
			curNorth[y]++;
			curWest[x]++;
			if(x==n-1 && y==n-1 && curNorth[n-1] ==north[n-1] && curWest[n-1] ==west[n-1] &&count==path.length-1) {
				path[path.length-1] = n*n-1;
				for(int i=0;i<path.length;i++) System.out.print(path[i]+" ");
				System.exit(0);
			}else if(curNorth[y]<=north[y] && curWest[x]<=west[x]) {
				map[x][y]=1;
				path[count] = n*x+y;
				count++;
				for(int i=0;i<4;i++) {
					if(i==0 && y>0) dfs(x,y-1);
					else if(i==1 && x<n-1) dfs(x+1,y);
					else if(i==2 && y<n-1) dfs(x,y+1);
					else if(i==3 && x>0) dfs(x-1,y);
				}
				map[x][y]=0;
				count--;
			}
			curNorth[y]--;
			curWest[x]--;
		}
	}
}
