package other.classicalAlgorithm;

public class EightQueen {
	static int n=4,count;
	public static void main(String[] args) {
		int[][] mainChess = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mainChess[i][j]=0;
			}
		}
		putChess(0,mainChess);
	}
	public static void putChess(int row,int[][] chess) {
		int[][] currentChess = (int[][])chess.clone();
		if(row==n) {
			count++;
			System.out.println("第"+count+"种");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(currentChess[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			return;
		}else {
			for(int i=0;i<n;i++) {
				if(!isDanger(row,i,currentChess)) {
					for(int j=0;j<n;j++) {
						currentChess[row][j]=0;
					}
					currentChess[row][i] =1;
					putChess(row+1,currentChess);
				}
			}
		}
	}

	public static boolean isDanger(int row,int col,int[][] currentChess) {
		for(int i=0;i<row;i++) {
			if(currentChess[i][col]==1)return true;
			for(int j=0;j<n;j++) {
				if(((row+col)==(i+j) || (row-col)==(i-j))&&currentChess[i][j]==1) return true;
			}
		}
		return false;
	}

}
