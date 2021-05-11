package lanqiao_GBK.c算法训练

�㷨ѵ��;
/**
 * (K��������̬�滮��
 * @author DELL
 *
 */
import java.util.Scanner;
public class ALGO_003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int l = sc.nextInt();
		int[][] plan = new int[l+1][k];
		for(int i=0;i<k;i++) {
			plan[1][i] = 1;
		}
		for(int i=2;i<=l;i++) {
			for(int j=0;j<k;j++) {
				for(int m=0;m<k;m++) {
					if(j!=m-1 && j!=m+1) {
						plan[i][j]+=plan[i-1][m];
						plan[i][j]%=1000000007;
					}
				}
			}
		}
		int res=0;
		for(int i=1;i<k;i++) {
			res+=plan[l][i];
			res%=1000000007;
		}
		System.out.println(res);
	}
}
