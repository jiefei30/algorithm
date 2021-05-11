package lanqiao_GBK.a3第八届国赛

�ڰ˽����;

/**
 * С��ϲ����һ��Χ����վ���ұ������߶��ġ������վ������ע���û�����һ�����֣���������Χ��ˮƽ��

С��������վ���Զ��Ծ�ϵͳ��ƥ�����ʱ��ֻ�Ὣ���ֲ�ǡ����K�������û�ƥ����һ��������˷ֲ�С�ڻ����K��ϵͳ�����Ὣ����ƥ�䡣

����С��֪�������վ�ܹ���N���û����Լ����ǵĻ��ֱַ���A1, A2, ... AN��

С�����˽��������ж������û�ͬʱ����Ѱ�Ҷ��֣�����ϵͳȴһ���Ծֶ�ƥ�䲻����(���������û����ֲ����K)��  

����
----
��һ�а�������������N��K��
�ڶ��а���N������A1, A2, ... AN��  

����30%�����ݣ�1 <= N <= 10
����100%�����ݣ�1 <= N <= 100000, 0 <= Ai <= 100000, 0 <= K <= 100000

���
----
һ������������𰸡�

�������룺
10 0
1 4 2 8 5 7 1 4 2 8

���������
6


 * @author DELL
 *
 */
public class A5_�Ծ�ƥ�� {
	public static void main(String[] args) {
		int resalt = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n+1];
		for(int i=0;i<n;i++) {
			a[sc.nextInt()]++;
		}
		if(k>=n) {
			resalt=n;
		}
		else if(k==0) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=0) resalt++;
			}
		}
		else 
		{
			int[] buf = new int[n/k+2];
			int[] dp = new int[n/k+2];
			for(int i=0;i<k;i++)
			{
				int len = 1;
				for(int j=i;j<n+1;j+=k)
				{
					buf[len++] = a[j];
				}
				dp[0] = 0;
				dp[1] = buf[1];
				for(int j=2;j<len;j++) 
				{
					dp[j] = Math.max(dp[j-1], dp[j-2]+buf[j]);
				}
				resalt += dp[len-1];
			}
		}
		System.out.println(resalt);
	}

}
