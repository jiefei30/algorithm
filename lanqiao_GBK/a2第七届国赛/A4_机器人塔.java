package lanqiao_GBK.a2第七届国赛

���߽����;

/**
 * X����Ļ����˱��������������ַ�װ��A��B��
������α��ݵ��Ǵ����������

���ƣ�

     A
    B B
   A B A
  A A B B
 B B B A B
A B A B B A

���ڵ����������ǣ�
  
  A ֻ��վ�� AA �� BB �ļ��ϡ�
  B ֻ��վ�� AB �� BA �ļ��ϡ�

��������ǰ��������Ӽ���һ�£��ڸ���A��B������ʱ��������ɶ����ֻ���������

����һ���������� M �� N���ո�ֿ���0<M,N<500��,�ֱ��ʾA��B����������֤���������ԡ�

Ҫ�����һ����������ʾ���Բ����Ļ���������

���磺
�û����룺
1 2

����Ӧ�������
3


�����磺
�û����룺
3 3

����Ӧ�������
4

��ԴԼ����
��ֵ�ڴ����� < 256M
CPU����  < 1000ms
 * @author DELL
 *
 */
public class A4_�������� {
	static int M;
	static int N;
	static int W;
	static int[][] map;
	static int count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		W = (int)(Math.sqrt(1+8*(M+N))+1)/2-1;
		map = new int[W][W];
		dfs(W-1,0);
		System.out.println(count);
	}
	public static void dfs(int row,int col) {
		if(M<0||N<0)return;
		if(col>row) {
			row--;
			col=0;
		}
		if(row == -1) count++;
		else if(row==W-1) {
			for(int i=0;i<2;i++) {
				if(i==0 && M>0) {
					M--;
					map[row][col]=1;
					dfs(row,col+1);
					map[row][col]=0;
					M++;
				}else if(i==1 && N>0) {
					N--;
					map[row][col]=2;
					dfs(row,col+1);
					map[row][col]=0;
					N++;
				}
			}
		}else {
			for(int i=0;i<2;i++) {
				if(i==0 && M>0 && (map[row+1][col]+map[row+1][col+1])%2==0) {
					M--;
					map[row][col]=1;
					dfs(row,col+1);
					map[row][col]=0;
					M++;
				}else if(i==1 && N>0 && (map[row+1][col]+map[row+1][col+1])==3) {
					N--;
					map[row][col]=2;
					dfs(row,col+1);
					map[row][col]=0;
					N++;
				}
			}
		}
	}
}
