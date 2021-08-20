package other.classicalAlgorithm;

public class Knapsack {
	public static void main(String[] args) {
		int[][] plan = new int[6][21];
		int[] w = {0,2,4,8,10,13};
		int[] v = {0,3,5,9,12,15};
		int v1,v2;
		for(int id=1;id<6;id++) {
			for(int C=1;C<21;C++) {
				if(w[id]>C) plan[id][C]=plan[id-1][C];
				else {
					v1 = plan[id-1][C-w[id]]+v[id];
					v2 = plan[id-1][C];
					plan[id][C] = v1 >=v2 ?v1:v2;
				}
			}
		}
		//输出背包
		for(int i=0;i<6;i++) {
			for(int j=0;j<21;j++) {
				if (j > 9 && i < 3) {
					System.out.print(plan[i][j]+"    ");
				}else {
					System.out.print(plan[i][j]+"   ");
				}
			}
			System.out.println();
		}
	}
}
