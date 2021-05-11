package lanqiao.a3第八届国赛;

import java.util.Scanner;

/**
 * n个人参加某项特殊考试。
为了公平，要求任何两个认识的人不能分在同一个考场。
求是少需要分几个考场才能满足条件。

输入格式：
第一行，一个整数n(1<n<100)，表示参加考试的人数。
第二行，一个整数m，表示接下来有m行数据
以下m行每行的格式为：两个整数a，b，用空格分开 (1<=a,b<=n)  表示第a个人与第b个人认识。

输出格式：
一行一个整数，表示最少分几个考场。

例如：
输入：
5
8
1 2
1 3
1 4
2 3
2 4
2 5
3 4
4 5

程序应该输出：
4

再比如：
输入：
5
10
1 2
1 3
1 4
1 5
2 3
2 4
2 5
3 4
3 5
4 5

则程序应该输出：
5

资源约定：
峰值内存消耗 < 256M
CPU消耗  < 1000ms
 * @author DELL
 *
 */
public class C5_分考场 {
	static int n;							//人数
	static int[][] relation;				//每个人之间的关系
	static int[] classroom;					//每个人在哪个考场
	static int res;							//最终结果
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		res=n+1;
		int m = sc.nextInt();
		relation = new int[n+1][n+1];
		classroom = new int[n+1];
		classroom[1]=1;						//先把第一个人分在第一个考场
		for(int i=1;i<=n;i++) relation[i][i]=1;//特殊处理
		int x,y;
		for(int i=0;i<m;i++) {
			x=sc.nextInt();
			y=sc.nextInt();
			relation[x][y]=1;
			relation[y][x]=1;
		}
		dfs(2,1);							//从第二个人开始, 已经开的考场数量是一个
		System.out.println(res);
	}
	public static void dfs(int student,int count) {
		System.out.println(count);
		if(count>=res)return;							  //剪枝
		else if(student==n+1) res = count<res?count:res;  //出口
		else {
			for(int j=1;j<=n;j++) {
				if(relation[student][j]==0 && isOK(student,classroom[j])) {			//这个人和自己不认识而且isOK==true
					classroom[student] = classroom[j];								//将自己分到该同学的考场
					dfs(student+1,count);											//下个同学，考场数量不变
					classroom[student] = 0;											//回溯
				}
			}
			if(classroom[student]==0) {						//如果所有同学都测试过了自己还没分到考场，就新开一个；
				classroom[student]=count+1;											
				dfs(student+1,count+1);
				classroom[student] = 0;
			}
		}
	}
	public static boolean isOK(int student,int room) {
		if(room==0)return false;							//如果这个人还没分到考场
		for(int i=1;i<=n;i++) {
			if(relation[student][i]==1 && classroom[i]==room)return false;		//自己认识的人里有人在这个考场
		}
		return true;
	}
}
