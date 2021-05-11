/*
 *  ���ʺ�
 */
package lanqiao_GBK.a入门训练����ѵ��;

public class ���ʺ� {
	static int n=2,count=0;
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
		int[][] chess2=(int[][])chess.clone();     //��chess�����ֵ��ֵ��chess2
		if(row==n) {
			count++;
			System.out.println("��"+count+"�֣�");
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
						chess2[row][i]=0;		//����forѭ������Ҫ��������
					}
					chess2[row][j]=1;
					putQueen(row+1,chess2);  //�����row+1����Ҫ
				}
			}
		}
	}
	public static boolean isDanger(int row,int col,int[][] chess) {
		for(int i=0;i<row;i++) {
			if(chess[i][col]==1 ) {
				return true;
			}
		}
		return false;
	}
}
