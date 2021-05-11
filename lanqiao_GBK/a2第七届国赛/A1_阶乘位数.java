package lanqiao_GBK.a2第七届国赛

���߽����;

/**
 * 
9�Ľ׳˵��ڣ�362880
���Ķ����Ʊ�ʾΪ��1011000100110000000
������ֹ���19λ��

������㣬9999 �Ľ׳˵Ķ����Ʊ�ʾһ���ж���λ��
 */
public class A1_�׳�λ�� {
	public static void main(String[] args) {
		BigInteger a = new BigInteger("1");
		for(int i=9999;i>0;i--) {
			a = a.multiply(BigInteger.valueOf(i));
		}
		String str = new BigInteger(String.valueOf(a),10).toString(2);
		System.out.println(str.length());
	}
}
