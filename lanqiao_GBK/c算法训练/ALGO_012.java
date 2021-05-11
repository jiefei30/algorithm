package lanqiao_GBK.c算法训练

�㷨ѵ��;
import java.util.LinkedList;
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
import java.util.Scanner;


//public class ALGO_012 {
//	public static String str="";
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println(transform(sc.nextInt()));
//	}
//	public static String transform(int number) {
//		if(number==0)return "";
//		String str1="";
//		int mi=0;	
//		int yu=0;
//		if(number>2) {
//			int current=2;
//			for(;current<=number;mi++) {
//				current = current*2;
//			}	
//			yu = number-current/2;
//			if(mi==1)str1= "2";
//			else str1=transform(mi);
//		}else {
//			if(number==1)return "2(0)";
//			else if(number==2) return "2";
//		}
//		return str=str+str1+"+"+transform(yu);
//	}
//}



public class ALGO_012
{
	public static void main(String args[])
	{
		Scanner cn=new Scanner (System.in);
		int n=cn.nextInt();	
		System.out.println(kk(n));
	}
	public static String kk(int n)
	{
		LinkedList<Integer> list=new LinkedList<Integer>();   //��������
		String str=new String("");
		int t,u=n;
		while(true)
		{
			t=u%2;
			u=u/2;
			list.add(t);
			if(u==0)break;
		}
		int count=0;
		for(int i=list.size()-1;i>=0;i--)
		{
			if(list.get(i)==1)
			{			
				if(count>0)str=str+"+";		 //����str���˵�һ��û��+��    	
				if(i==1)str=str+2;
				if(i==0)str=str+"2(0)";
				if(i!=0&&i!=1)str=str+"2("+kk(i)+")";	//���еݹ����				
				count=1;
			}
		}
		return str;    
	}
}
