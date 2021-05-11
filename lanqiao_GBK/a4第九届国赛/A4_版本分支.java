package lanqiao_GBK.a4第九届国赛

�ھŽ����;

/**
 * С������ά����˾һ����ֵ���Ŀ�������Ŀ�Ĵ���һֱ�ڲ��Ϸ�֧(branch)���Ǵ�δ�������ϲ�(merge)��
���������Ŀ�Ĵ���һ����N���汾�����1~N������1�Ű汾������İ汾��
����1�Ű汾֮�⣬�����汾�Ĵ��붼ǡ����һ��ֱ�ӵĸ��汾������N���汾�γ���һ����1Ϊ�������νṹ��  

����ͼ����һ�����ܵİ汾����

    1
   / \
  2   3
  |  / \
  5 4   6

����С����Ҫ�������汾x�ǲ��ǰ汾y�����Ȱ汾�����ܰ���С����

����
----
��һ�а�����������N��Q������汾�����Ͳ�ѯ������  
����N-1�У�ÿ�а���2������u��v������汾u�ǰ汾v��ֱ�Ӹ��汾��  
��֮��Q�У�ÿ�а���2������x��y������ѯ�ʰ汾x�ǲ��ǰ汾y�����Ȱ汾��  

����30%�����ݣ�1 <= N <= 1000  1 <= Q <= 1000  
����100%�����ݣ�1 <= N <= 100000  1 <= Q <= 100000  

���
----
����ÿ��ѯ�ʣ����YES��NO����x�Ƿ���y�����ȡ�  

���������롿
6 5
1 2
1 3
2 5
3 6
3 4
1 1
1 4
2 6
5 2
6 4

�����������
YES
YES
NO
NO
NO

��ԴԼ����
��ֵ�ڴ����ģ���������� < 256M
CPU����  < 1000ms
 * @author DELL
 *
 */
public class A4_�汾��֧ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[][] relation = new int[N-1][2];
		for(int i=0;i<N-1;i++) {
			relation[i][0] = sc.nextInt();
			relation[i][1] = sc.nextInt();
		}
		int[][] quest = new int[Q][2];
		for(int i=0;i<Q;i++) {
			quest[i][0] = sc.nextInt();
			quest[i][1] = sc.nextInt();
		}
		int p,c,p1;
		for(int i=0;i<Q;i++) {
			p = quest[i][0] ;
			c = quest[i][1];
			p1=c;
			if(p==1) System.out.println("YES");
			else {
				while(p1!=1) {
					c=p1;
					for(int j=0;j<N-1;j++) {
						if(relation[j][1]==c)p1=relation[j][0];
					}
					if(p1==1)System.out.println("NO");
					if(p1==p) {System.out.println("YES");break;}
				}
			}
		}
		
	}
}
