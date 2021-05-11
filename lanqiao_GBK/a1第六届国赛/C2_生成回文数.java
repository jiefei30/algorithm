package lanqiao_GBK.a1第六届国赛���������;
/**
 * ���⣺���ɻ�����

��ν�������������ҶԳƵ����֣����磺
585,5885,123321...
��Ȼ������������Ҳ���������ǶԳƵġ�

С��������һ�����ɻ������ķ�����
���磬ȡ����19���������Լ��ķ�ת����ӣ�
19 + 91 = 110��������ǻ����������ٽ���������̣�
110 + 011 = 121 ����ǻ������ˡ�

200���ڵ������У����������������30�����ڱ�ɻ�������ֻ��һ�����ֺ����⣬���������1000�Σ���������̵ؾܾ����ģ�

�����ύ��������֣���Ҫ��д�κζ�������ݡ�
 * @author DELL
 *
 */
public class C2_���ɻ����� {
	static int count=0;
	static long number=10;
	public static void main(String[] args) {
		for(;number<=200;number++) {
			System.out.println(number);
			find(number);
		}
		
	}
	public static void find(long n) {
		if(count<1000) {
			if(isHuiWen(n)) {
				count++;
				return;
			}else {
				find(n+fanzhuan(n));
			}
		}else return;
	}

	public static long fanzhuan(long n) {
		String s = n+"";
		char[] cha = s.toCharArray();
		String s2="";
		for(int i=0;i<cha.length;i++) {
			s2+=cha[cha.length-1-i];
		}
		if(s2.charAt(0)=='0') {
			s2 = s2.substring(1);
			if(s2.charAt(0)=='0') {
				s2 = s2.substring(1);
			}
		}
		return Long.parseLong(s2);
	}
	public static boolean isHuiWen(long n) {
		String huiwen = n+"";
		int l;
		char[] cha = huiwen.toCharArray();
		if(cha.length%2==0) l=cha.length/2;
		else l = (cha.length-1)/2;
		for(int i=0;i<l;i++) {
			if(cha[i]!=cha[cha.length-1-i]) return false;
		}
		return true;
	}
}
