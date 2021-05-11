package lanqiao.a1第六届国赛;
/**
 * 标题：穿越雷区

X星的坦克战车很奇怪，它必须交替地穿越正能量辐射区和负能量辐射区才能保持正常运转，否则将报废。
某坦克需要从A区到B区去（A，B区本身是安全区，没有正能量或负能量特征），怎样走才能路径最短？

已知的地图是一个方阵，上面用字母标出了A，B区，其它区都标了正号或负号分别表示正负能量辐射区。
例如：
A + - + -
- + - - +
- + + + -
+ - + - +
B + - + -

坦克车只能水平或垂直方向上移动到相邻的区。

数据格式要求：

输入第一行是一个整数n，表示方阵的大小， 4<=n<100
接下来是n行，每行有n个数据，可能是A，B，+，-中的某一个，中间用空格分开。
A，B都只出现一次。

要求输出一个整数，表示坦克从A区到B区的最少移动步数。
如果没有方案，则输出-1

例如：
用户输入：
5
A + - + -
- + - - +
- + + + -
+ - + - +
B + - + -

则程序应该输出：
10

资源约定：
峰值内存消耗（含虚拟机） < 512M
CPU消耗  < 2000ms
 */
import java.util.Scanner;

public class B4_穿越雷区 {
	static int x,y,n,res=16000;
	static int[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n  = sc.nextInt();
		map = new int[n][n];
		String k;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				k=sc.next();
				if(k.equals("+")) map[i][j] = 1;
				else if(k.equals("-")) map[i][j] = 0;
				else if(k.equals("B")) map[i][j] = 3;
				else {
					map[i][j] = 2;
					x=i;
					y=j;
				}
			}
		}
		dfs(x,y,0,0);
		System.out.println(res);
	}
	public static void dfs(int x,int y,int area,int step) {
		if(map[x][y]==4 || map[x][y]==area)return;
		else if(map[x][y]==3) {
			res = step<res?step:res;
			return;
		}else {
			if(step<res) {
				int cur = map[x][y];
				map[x][y]=4;
				for(int i=0;i<4;i++) {
					if(i==0 && y>0) { 
						dfs(x,y-1,cur,step+1);
					}else if(i==1 && x<n-1) {
						dfs(x+1,y,cur,step+1);
					}else if(i==2 && y<n-1) {
						dfs(x,y+1,cur,step+1);
					}else if(i==3 && x>0) {
						dfs(x-1,y,cur,step+1);
					}
				}
				map[x][y]=cur;	
			}
		}
	}
}
