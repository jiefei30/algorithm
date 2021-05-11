package lanqiao_GBK.c算法训练

�㷨ѵ��;
/**
 * (�ݷ��ֽ�
 * ��������
�����κ�һ����������������2���ݴη���ʾ�����磺
����137=27+23+20 
����ͬʱԼ����������������ʾ����ab �ɱ�ʾΪa��b����
�����ɴ˿�֪��137�ɱ�ʾΪ��
����2��7��+2��3��+2��0��
������һ����7= 22+2+20 ��21��2��ʾ��
����3=2+20 
�����������137�ɱ�ʾΪ��
����2��2��2��+2+2��0����+2��2+2��0����+2��0��
�������磺
����1315=210 +28 +25 +2+1
��������1315���ɱ�ʾΪ��
����2��2��2+2��0����+2��+2��2��2+2��0������+2��2��2��+2��0����+2+2��0��
�����ʽ
�����������һ��������N��N<=20000����ΪҪ��ֽ��������
�����ʽ
���������������һ���ַ�����Ϊ����Լ����n��0��2��ʾ���ڱ�ʾ�в����пո�
 */


public class ALGO_012_�ݷ��ֽ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(transform(sc.nextInt()));
	}
	public static String transform(int number) {
		String str1="";
		int mi=0;	
		int yu=0;
		if(number>2) {
			int current=2;
			for(;current<=number;mi++) {
				current = current*2;
			}	
			yu = number-current/2;
			if(mi==1)str1= "2";
			else str1="2("+transform(mi)+")";
		}else {
			if(number==0)return "";
			else if(number==1)return "2(0)";
			else if(number==2) return "2";
		}
		if(yu==0) return str1;
		else return str1+"+"+transform(yu);
	}
}