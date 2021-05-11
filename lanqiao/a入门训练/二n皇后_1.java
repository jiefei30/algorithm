package lanqiao.a入门训练;
/**
 * 2n皇后第一种思路    (运行超时)
 */
import java.util.Scanner;

public class 二n皇后_1 {
	static int n,count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				n=sc.nextInt();
		int[][] chess = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				chess[i][j]=sc.nextInt();
			}
		}
		putQueen(0,chess);
		System.out.println(count);
	}
	public static void putQueen(int row,int[][] chess) {
		int[][] chess2=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				chess2[i][j]=chess[i][j];
			}
		}
		if(row==n) {
			count++;
		}else {
			for(int j=0;j<n;j++) {
				if(!isDanger(row, j, chess2,true)) {
					for(int a=0;a<n;a++) {
						chess2[row][a] = chess[row][a];
					}
					chess2[row][j]=2;
					int[][] chess3=new int[n][n];
					for(int a=0;a<n;a++) {
						for(int b=0;b<n;b++) {
							chess3[a][b]=chess2[a][b];
						}
					}
					for(int k=0;k<n;k++) {
						if(!isDanger(row, k, chess3,false)) {
							for(int a=0;a<n;a++) {						
									chess3[row][a]=chess2[row][a];							
							}
							chess3[row][k]=3;
							putQueen(row+1,chess3);  //这里的row+1很重要，目前只能写成这样
						}
					}
				}
			}
		}
	}
	public static boolean isDanger(int row,int col,int[][] chess,boolean black) {
		int a=row+col,b=row-col;
		if(chess[row][col]!=0 && chess[row][col]!=2) {	
			for(int i=0;i<row;i++) {
				if(black) {
					if(chess[i][col]==2) {
						return true;
					}

					for(int j=0;j<n;j++) {
						if(((i+j)==(a)||(i-j)==(b))&&chess[i][j]==2) 
							return true;
					}	
				}else {
					if(chess[i][col]==3 ) {
						return true;
					}
					for(int j=0;j<n;j++) {
						if(((i+j)==(a)||(i-j)==(b))&&chess[i][j]==3) 
							return true;
					}		
				}
			}
			return false;
		}else return true;
	}
}

