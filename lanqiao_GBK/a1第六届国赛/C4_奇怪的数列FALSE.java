package lanqiao_GBK.a1第六届国赛

���������;

/**
 * 
 * ���⣺��ֵ�����

��X�ǽػ�һ�ݵ��룬��һЩ���֣����£�
13
1113
3113
132113
1113122113
....

YY��ʿ����ҹ�о��������˹��ɣ�
��һ�е����������ʲô���Ժ�ÿһ�ж��Ƕ���һ�С���������
�����2�У��ǶԵ�1�е���������˼�ǣ�1��1��1��3�������ǣ�1113
��3�У���˼�ǣ�3��1,1��3�������ǣ�3113

�����дһ�����򣬿��Դӳ�ʼ���ֿ�ʼ���������������ı任��

���ݸ�ʽ��

��һ������һ��������ɵĴ���������100λ
�ڶ��У�һ������n����ʾ��Ҫ�������任���ٴΣ�n������20

���һ��������ʾ���һ�α任��Ľ����

���磺
�û������
5
7

�����Ӧ�������
13211321322115
 * @author DELL
 *
 */
public class C4_��ֵ�����FALSE {
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		count = sc.nextInt();
		char[] b = a.toCharArray();
		String c="";
		int index=0;
		char u;
		int length=0;
		while(count>0) {
				c=""; 
			while(index<b.length) {
				u = b[index];
				length++;
				index++;
				if(index<b.length-1) {
					while(u==b[index]) {
						length++;
						if(index<b.length-1)index++;
					}
				}
				c+=length+""+u;
				length=0;
			}
			count--;
			b=c.toCharArray();
			index=0;
			length=0;
		}
		System.out.println(c);
	}
}
