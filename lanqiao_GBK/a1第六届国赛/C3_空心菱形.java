package lanqiao_GBK.a1第六届国赛���������;
/**
 * ���⣺��������

С���ոտ�����һ��С���򣬿��Դ�ӡ�������ģ�Ŀ������Σ���ģΪ6ʱ������ͼ��
****** ******
*****   *****
****     ****
***       ***
**         **
*           *
**         **
***       ***
****     ****
*****   *****
****** ******
������ж������⣬�ο���ͼ1.png����

��һ���ˣ��ߵ��˵�Դ�����һ���޸�û�б���.....
ë�����ڻ��ߵĲ��֡�
�������С������������д���߲���ȱʧ�Ĵ��롣

public class Main
{
	static String pr(int m, int n)
	{
		String s = "";
		for(int i=0; i<n; i++) s += " ";
		for(int i=0; i<m; i++) s = "*" + s + "*";
		return s;
	}
	
	static void f(int n)
	{
		String s = pr(1,n*2-1) + "\n";
	    String s2 = s;
	    	
		for(int i=1; i<n; i++){
			s = ____________________________________;  //���λ��
			s2 = s + s2 + s; 
		}
		
		System.out.print(s2);
	}
	
	public static void main(String[] args)
	{
		f(6);
	}
}

ע�⣺ֻ��дȱ�ٵ����ݣ���Ҫ��д�������д����˵�������֡�
 * @author DELL
 *
 */
public class C3_�������� {
	static String pr(int m, int n)
	{
		String s = "";
		for(int i=0; i<n; i++) s += " ";
		for(int i=0; i<m; i++) s = "*" + s + "*";
		return s;
	}
	
	static void f(int n)
	{
		String s = pr(1,n*2-1) + "\n";
	    String s2 = s;
	    	
		for(int i=1; i<n; i++){
			s = pr(i+1,2*(n-i)-1)+"\n";
			s2 = s + s2 + s; 
		}
		
		System.out.print(s2);
	}
	
	public static void main(String[] args)
	{
		f(6);
	}
}
