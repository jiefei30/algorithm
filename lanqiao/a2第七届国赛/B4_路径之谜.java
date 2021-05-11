package lanqiao.a2第七届国赛;

import java.util.Scanner;

public class B4_路径之谜 {
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
			if(x==n-1 && y==n-1 && curNorth[n-1] ==north[n-1] && curWest[n-1] ==west[n-1]) {
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
