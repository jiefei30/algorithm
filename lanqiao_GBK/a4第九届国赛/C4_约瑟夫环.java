package lanqiao_GBK.a4第九届国赛

�ھŽ����;

/**
 * Լɪ��

n ���˵ı���� 1~n�������������Ű�˳ʱ���ų�һ��ԲȦ���ӱ����1���˿�ʼ˳ʱ�뱨����
�������Ǵ�1���𣩵����� k ��ʱ������˾��˳���ϷȦ����һ�������´�1��ʼ������
�����ʣ�µ��˵ı�š������������Լɪ�����⡣

����Ŀ������֪ n��k ������£������ʣ�µ��˵ı�š�

��Ŀ��������һ�У�2���ո�ֿ�������n, k
Ҫ�����һ����������ʾ���ʣ�µ��˵ı�š�

Լ����0 < n,k < 1����

�������룺
10 3

����Ӧ�������
4

��ԴԼ����
��ֵ�ڴ����ģ���������� < 256M
CPU����  < 1000ms

 * @author DELL
 *
 */
public class C4_Լɪ�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = i+1;
		}
		int count=0,index=0;
		while(n>1) {
			if(arr[index]!=0) {
				count++;
				if(count==k) {
					arr[index]=0;
					count=0;
					n--;
				}
			}
			if(index==arr.length-1)index=0;
			else index++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0)System.out.println(i+1);
		}
	}
}
