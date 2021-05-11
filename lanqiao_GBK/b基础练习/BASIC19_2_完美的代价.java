package lanqiao_GBK.b基础练习

������ϰ;
/**
 * ��������
�������Ĵ�����һ��������ַ��������������Ҷ��ʹ����������һ���ġ�С������Ϊ���Ĵ����������ġ����ڸ���һ����������һ���ǻ��ĵģ�����������ٵĽ�������ʹ�øô����һ�������Ļ��Ĵ���
���������Ķ����ǣ������������ڵ��ַ�
��������mamad
������һ�ν��� ad : mamda
�����ڶ��ν��� md : madma
���������ν��� ma : madam (���ģ�������)
�����ʽ
������һ����һ������N����ʾ���������ַ����ĳ���(N <= 8000)
�����ڶ�����һ���ַ���������ΪN.ֻ����Сд��ĸ
�����ʽ
����������ܣ�������ٵĽ���������
�����������Impossible
��������
5
mamad
�������
3
 */

public class BASIC19_2_�����Ĵ��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		String s = sc.next();
		char[] a = s.toCharArray();
		int[] b = new int[26];
		for(int i=0;i<l;i++) {
			b[(int)s.charAt(i)-'a']++;
		}
		System.out.println(b[6]+" "+b[25]);
		int k=0;
		for(int i=0;i<26;i++)
		{
			if(b[i]%2!=0)
				k++;
		}
		if(k>2) {
			System.out.println("Impossible");
		}else {
			//h���γɻ������������
			//m�������ַ���ʱ��������ĸ�����е�λ���������
			//g���ڸı佻��λ�ó���
			int h=0,g=l,m=0;
			for(int i=0;i<(l+1)/2;i++)
			{
				int j;
				//�����Ƿ���ڲ�ͬλ�õ���ͬ��ĸ
				for(j=g-1;j>i;j--)
				{
					//����
					if(a[i]==a[j])
					{
						while(j<g-1)
						{
							//��������Ӧλ��
							char t;
							t=a[j];
							a[j]=a[j+1];
							a[j+1]=t;
							j++;
							h++;//��¼����
						}
						g--;
						break;
					}
				}
				//�����ڣ���Ϊ������ĸ
				if(j==i) m=(l-1)/2-i;
			}
			System.out.println(h+m);
		}

	}
}
