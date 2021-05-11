package lanqiao_GBK.b基础练习

������ϰ;

/**
 * ��������
����ʮ�����������ڳ������ʱ����Ҫʹ�õ���һ�������ı�ʾ��ʽ������0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F��16�����ţ��ֱ��ʾʮ��������0��15��
ʮ�����Ƶļ�����������16��1������ʮ������16��ʮ����������10����ʮ���Ƶ�17��ʮ����������11���Դ����ƣ�ʮ���Ƶ�30��ʮ����������1E��
��������һ���Ǹ�������������ʾ��ʮ�����Ƶ���ʽ��
�����ʽ
�����������һ���Ǹ�����a����ʾҪת��������0<=a<=2147483647
�����ʽ
����������������16���Ʊ�ʾ
��������
30
�������
1E
 */
public class BASIC10_ʮ����תʮ������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int yu =0;
		String sixteen = "";
		while(n>0) {
			yu = n%16;
			if(yu<10) {
				sixteen=yu+sixteen;
			}else switch(yu) {
				case 10:sixteen="A"+sixteen;break;
				case 11:sixteen="B"+sixteen;break;
				case 12:sixteen="C"+sixteen;break;
				case 13:sixteen="D"+sixteen;break;
				case 14:sixteen="E"+sixteen;break;
				case 15:sixteen="F"+sixteen;break;
			}
			n = (int)n/16;
		}
		if(sixteen=="")System.out.println(0);
		else System.out.println(sixteen);
	}
}
