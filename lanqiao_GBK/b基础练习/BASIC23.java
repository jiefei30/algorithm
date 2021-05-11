package lanqiao_GBK.b基础练习

������ϰ;
/**
 *  оƬ����  
 */
import java.util.Scanner;

public class BASIC23 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int[][] test = new int[n][n];
		int[][] res = new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				test[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) continue;
				else {
					if(test[i][j]==1) res[j][0]++;
					else res[j][1]++;
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(res[i][0]>=res[i][1]) System.out.print(i+1+" ");
		}
	}
}
