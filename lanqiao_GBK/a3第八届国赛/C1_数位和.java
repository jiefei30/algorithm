package lanqiao_GBK.a3第八届国赛�ڰ˽����;
/**
 * 
��ѧ�Ҹ�˹��С��ʱ�����ֹ��ˡ�һ����ʦָ����������Ŀ�ǣ�1+2+...+100��
��˹���������𰸣�5050!

���������������Ƶġ��������ǰ�һ���������ּ����������ǶԸ����ֵ�ÿһ����λ���ۼӡ�
������1�ӵ�100�ġ��͡��ǣ�901

��10�ӵ�15�ǣ�21��Ҳ���ǣ�1+0+1+1+1+2+1+3+1+4+1+5��������㶼���Գ�����ġ�

�������ġ��ӷ�������1�ӵ�1000�Ƕ����أ� ��ͨ��������ύ�ý����

��Ȼ�����ǲ��������������˹һ�����������ֱ�����µ����ܣ�ֻҪ��������æ��һ�ж�easy!

ע�⣺����Ҫ�ύ����һ����������Ҫ��д�κζ�������ݣ����磺˵�������֣�

 * @author DELL
 *
 */
public class C1_��λ�� {
	public static void main(String[] args) {
		int res=0;
		String s;
		for(int i=1;i<=1000;i++) {
			s=i+"";
			for(int j=0;j<s.length();j++) {
				res+=Integer.parseInt(s.charAt(j)+"");
			}
		}
		System.out.println(res);
	}
}
