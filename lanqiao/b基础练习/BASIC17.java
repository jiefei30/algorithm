package lanqiao.b基础练习

»ù´¡Á·Ï°;

import java.util.Scanner;

/**
 * ¾ØÕóµÄÃİ
 * @author DELL
 *
 */
public class BASIC17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		if(m==0) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==j) System.out.print(1);
					else System.out.print(0);
				}
				System.out.println();
			}
			return;
		}
		int[][] a = new int[n][n];
		int[][] c = new int[n][n];
		int[][] b = new int[n][n];
		int t=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = sc.nextInt();
				c[i][j] = a[i][j];
			}
		}
		for(int i=0;i<m-1;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					for(int l=0;l<n;l++) {
						t=t+c[j][l]*a[l][k];
					}
					b[j][k]=t;
					t=0;
				}
			}
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					c[j][k]=b[j][k];
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
