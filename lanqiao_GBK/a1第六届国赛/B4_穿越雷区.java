package lanqiao_GBK.a1第六届国赛

���������;
/**
 * ���⣺��Խ����

X�ǵ�̹��ս������֣������뽻��ش�Խ�������������͸��������������ܱ���������ת�����򽫱��ϡ�
ĳ̹����Ҫ��A����B��ȥ��A��B�������ǰ�ȫ����û���������������������������߲���·����̣�

��֪�ĵ�ͼ��һ��������������ĸ�����A��B�������������������Ż򸺺ŷֱ��ʾ����������������
���磺
A + - + -
- + - - +
- + + + -
+ - + - +
B + - + -

̹�˳�ֻ��ˮƽ��ֱ�������ƶ������ڵ�����

���ݸ�ʽҪ��

�����һ����һ������n����ʾ����Ĵ�С�� 4<=n<100
��������n�У�ÿ����n�����ݣ�������A��B��+��-�е�ĳһ�����м��ÿո�ֿ���
A��B��ֻ����һ�Ρ�

Ҫ�����һ����������ʾ̹�˴�A����B���������ƶ�������
���û�з����������-1

���磺
�û����룺
5
A + - + -
- + - - +
- + + + -
+ - + - +
B + - + -

�����Ӧ�������
10

��ԴԼ����
��ֵ�ڴ����ģ���������� < 512M
CPU����  < 2000ms
 */

public class B4_��Խ���� {
	static int x,y,n,res=16000;
	static int[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n  = sc.nextInt();
		map = new int[n][n];
		String k;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				k=sc.next();
				if(k.equals("+")) map[i][j] = 1;
				else if(k.equals("-")) map[i][j] = 0;
				else if(k.equals("B")) map[i][j] = 3;
				else {
					map[i][j] = 2;
					x=i;
					y=j;
				}
			}
		}
		dfs(x,y,0,0);
		System.out.println(res);
	}
	public static void dfs(int x,int y,int area,int step) {
		if(map[x][y]==4 || map[x][y]==area)return;
		else if(map[x][y]==3) {
			res = step<res?step:res;
			return;
		}else {
			if(step<res) {
				int cur = map[x][y];
				map[x][y]=4;
				for(int i=0;i<4;i++) {
					if(i==0 && y>0) { 
						dfs(x,y-1,cur,step+1);
					}else if(i==1 && x<n-1) {
						dfs(x+1,y,cur,step+1);
					}else if(i==2 && y<n-1) {
						dfs(x,y+1,cur,step+1);
					}else if(i==3 && x>0) {
						dfs(x-1,y,cur,step+1);
					}
				}
				map[x][y]=cur;	
			}
		}
	}
}
