package lanqiao_GBK.c算法训练

�㷨ѵ��;

/**
 * ��������
������һ��������λ��Ϊ�㣩�������Ҷ�������������һ�������Ǿͽ����֮Ϊ��������
�������磺����һ��10������56����56��65������56��������������õ�121��һ����������

�������磺����10������87��
����STEP1��87+78 = 165 STEP2��165+561 = 726
����STEP3��726+627 = 1353 STEP4��1353+3531 = 4884

�����������һ����ָ������һ��N���Ƶļӷ���������������4���õ�������4884��

����дһ�����򣬸���һ��N��2<=N<=10��N=16��������M������16��������Ϊ0-9��A-F���������پ����������Եõ���������
���������30�����ڣ�����30���������ܵõ����������������Impossible!��
	�����ʽ
�������У�N��M
	�����ʽ
�����������30�����ڵõ��������������STEP=xx�����������ţ�������xx�ǲ������������һ�С�Impossible!�����������ţ�
��������
9
87
�������
STEP=6
 * @author DELL
 *
 */
public class ALGO_014_������ {
	static int jinzhi;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		jinzhi = sc.nextInt();
		BigInteger a =new BigInteger(String.valueOf(sc.next()),jinzhi);
		int step=1;
		for(;step<=30;step++) {
			if(isHuiwen(a.add(turn(a)))) {
				System.out.println(step);
				break;
			}else {
				a = a.add(turn(a));
			}
		}
		if(step==31) System.out.println("Impossible!");
	}
	public static boolean isHuiwen(BigInteger a) {
		String str = new BigInteger(String.valueOf(a),10).toString(jinzhi);
		System.out.println(str);
		int b = (str.length()-str.length()%2)/2;
		for(int i=0;i<b;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) return false;
		}
		return true;
	}
	public static BigInteger turn(BigInteger a) {
		String str = new BigInteger(String.valueOf(a),10).toString(jinzhi);
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res+=str.charAt(i)+"";
		}
		return new BigInteger(String.valueOf(res),jinzhi);
	}
}
