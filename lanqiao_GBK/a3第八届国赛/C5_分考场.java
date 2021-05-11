package lanqiao_GBK.a3第八届国赛

�ڰ˽����;

/**
 * n���˲μ�ĳ�����⿼�ԡ�
Ϊ�˹�ƽ��Ҫ���κ�������ʶ���˲��ܷ���ͬһ��������
��������Ҫ�ּ���������������������

�����ʽ��
��һ�У�һ������n(1<n<100)����ʾ�μӿ��Ե�������
�ڶ��У�һ������m����ʾ��������m������
����m��ÿ�еĸ�ʽΪ����������a��b���ÿո�ֿ� (1<=a,b<=n)  ��ʾ��a�������b������ʶ��

�����ʽ��
һ��һ����������ʾ���ٷּ���������

���磺
���룺
5
8
1 2
1 3
1 4
2 3
2 4
2 5
3 4
4 5

����Ӧ�������
4

�ٱ��磺
���룺
5
10
1 2
1 3
1 4
1 5
2 3
2 4
2 5
3 4
3 5
4 5

�����Ӧ�������
5

��ԴԼ����
��ֵ�ڴ����� < 256M
CPU����  < 1000ms
 * @author DELL
 *
 */
public class C5_�ֿ��� {
	static int n;							//����
	static int[][] relation;				//ÿ����֮��Ĺ�ϵ
	static int[] classroom;					//ÿ�������ĸ�����
	static int res;							//���ս��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		res=n+1;
		int m = sc.nextInt();
		relation = new int[n+1][n+1];
		classroom = new int[n+1];
		classroom[1]=1;						//�Ȱѵ�һ���˷��ڵ�һ������
		for(int i=1;i<=n;i++) relation[i][i]=1;//���⴦��
		int x,y;
		for(int i=0;i<m;i++) {
			x=sc.nextInt();
			y=sc.nextInt();
			relation[x][y]=1;
			relation[y][x]=1;
		}
		dfs(2,1);							//�ӵڶ����˿�ʼ, �Ѿ����Ŀ���������һ��
		System.out.println(res);
	}
	public static void dfs(int student,int count) {
		System.out.println(count);
		if(count>=res)return;							  //��֦
		else if(student==n+1) res = count<res?count:res;  //����
		else {
			for(int j=1;j<=n;j++) {
				if(relation[student][j]==0 && isOK(student,classroom[j])) {			//����˺��Լ�����ʶ����isOK==true
					classroom[student] = classroom[j];								//���Լ��ֵ���ͬѧ�Ŀ���
					dfs(student+1,count);											//�¸�ͬѧ��������������
					classroom[student] = 0;											//����
				}
			}
			if(classroom[student]==0) {						//�������ͬѧ�����Թ����Լ���û�ֵ����������¿�һ����
				classroom[student]=count+1;											
				dfs(student+1,count+1);
				classroom[student] = 0;
			}
		}
	}
	public static boolean isOK(int student,int room) {
		if(room==0)return false;							//�������˻�û�ֵ�����
		for(int i=1;i<=n;i++) {
			if(relation[student][i]==1 && classroom[i]==room)return false;		//�Լ���ʶ�������������������
		}
		return true;
	}
}
