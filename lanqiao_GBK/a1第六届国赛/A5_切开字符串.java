package lanqiao_GBK.a1第六届国赛

���������;

/**
 * Pear��һ���ַ�����������ϣ�������г����Ρ�
����һ������ΪN��<=10^5�����ַ�����
Pearϣ��ѡ��һ��λ�ã����ַ������ظ�����©���г����Σ����ȷֱ���t��N-t�������ζ�����ǿգ���

Pear�����·�ʽ�����и�ķ�����
���塰�������Ӵ���Ϊ������Ϊ�����Ļ����Ӵ���
���гɵ������ַ����У�ǰһ������A������ͬ���������Ӵ�����һ������B������ͬ�ķ��������Ӵ�����÷����ĵ÷�ΪA*B��

ע�⣬��һ���е�B��ʾ���ǣ���...��������...����������: ��...������...����
��ô���е��и���У�A*B�����ֵ�Ƕ����أ�
���������ݡ�
�����һ��һ��������N��<=10^5��
������һ��һ���ַ���������ΪN�����ַ���������СдӢ����ĸ��
��������ݡ�
һ��һ������������ʾ�����A*B�����ֵ��
���������롿
10
bbaaabcaba
�����������
38
�����ݷ�Χ��
����20%�����ݣ�N<=100
����40%�����ݣ�N<=1000
����100%�����ݣ�N<=10^5

��ԴԼ����
��ֵ�ڴ����ģ���������� < 512M
CPU����  < 2000ms
 * @author DELL
 *
 */
public class A5_�п��ַ��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String org = sc.next();
		int res=0,cur=0;
		for(int i=0;i<length;i++) {
			cur = divide(org.substring(0,i+1),org.substring(i+1));
			res = cur>res?cur:res;
		}
		System.out.println(res);
	}
	public static int divide(String left,String right) {
		int A=0,B=0;
		for(int i=0;i<left.length();i++) {
			for(int j=i+1;j<left.length();j++) {
				if(is(left.substring(i, j))) A++;
			}
		}
		for(int i=0;i<right.length();i++) {
			for(int j=i+1;j<right.length();j++) {
				if(!is(right.substring(i, j))) B++;
			}
		}	
		return A*B;
	}
	public static boolean is(String str) {
		if(str.length()%2==0) {
			return false;
		}else {
			for(int i=0;i<str.length()-1;i++) {
				if(str.charAt(i)!=str.charAt(str.length()-1)) return false;
			}
			return true;
		}
	}
}
