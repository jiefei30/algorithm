/*
 *  四皇后
 */
package lanqiao.a入门训练;

public class 四皇后 {
	static int n=4,count=0;
	public static void main(String[] args) {
		int[][] chess = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				chess[i][j]=0;
			}
		}
		putQueen(0,chess);
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
			System.out.println("第"+count+"种：");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(chess2[i][j]);
				}
				System.out.println("");
			}
			System.out.println("");
		}else {
			for(int j=0;j<n;j++) {
				if(!isDanger(row, j, chess2)) {
					for(int i=0;i<n;i++) {
						chess2[row][i]=0;
					}
					chess2[row][j]=1;
					putQueen(row+1,chess2);  //这里的row+1很重要，目前只能写成这样
				}
			}
		}
	}
	public static boolean isDanger(int row,int col,int[][] chess) {
		for(int i=0;i<row;i++) {
			if(chess[i][col]==1 ) {
				return true;
			}
			for(int j=0;j<n;j++) {
				if(((i+j)==(row+col)||(i-j)==(row-col))&&chess[i][j]==1) return true;
			}
		}
		return false;
	}
}
