package other.weeklyAlgorithm;

/**
 *
 * @author DELL
 *
 */

import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double m=sc.nextDouble();
		double n=sc.nextDouble();
		double s=0;
		int[][] picture = new int[(int)m][(int)n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				picture[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(picture[i][j] == sc.nextInt()) s++;
			}
		}
		System.out.printf("%.2f",(s/(m*n))*100);
	}
}
