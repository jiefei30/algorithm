package lanqiao_GBK.a入门训练

����ѵ��;
/**
 * 
 * 2n�ʺ�ĵڶ���˼·������ʱ��
 */

public class ��n�ʺ�_2 {
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
		putBlackQueen(0,chess);
		System.out.println(count);
	}
	public static void putBlackQueen(int row,int[][] chess) {
		int[][] chess2=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				chess2[i][j]=chess[i][j];
			}
		}
		if(row==n) {
			putWhiteQueen(0,chess2);
		}else {
			for(int j=0;j<n;j++) {
				if(!isDanger(row, j, chess2,true)) {
					for(int i=0;i<n;i++) {          //����forѭ��ִ����һ��ʱ��������һ��ѭ����һ�е�����
						for(int k=0;k<n;k++) {		//����Ҫ���¸���
							chess2[i][k]=chess[i][k];
						}
					}
					chess2[row][j]=2;
					putBlackQueen(row+1,chess2);  //�����row+1����Ҫ��Ŀǰֻ��д������
				}
			}
		}
	}
	public static void putWhiteQueen(int row,int[][] chess) {
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
				if(!isDanger(row, j, chess2,false)) {
					for(int i=0;i<n;i++) {          //����forѭ��ִ����һ��ʱ��������һ��ѭ����һ�е�����
						for(int k=0;k<n;k++) {		//����Ҫ���¸���
							chess2[i][k]=chess[i][k];
						}
					}
					chess2[row][j]=3;
					putWhiteQueen(row+1,chess2);  //�����row+1����Ҫ��Ŀǰֻ��д������
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
