package lanqiao_GBK.a1第六届国赛���������;
/**
 * ���⣺��ͬ���ƺ�

С����ס��һ����ͬ���ͬ������ƺŶ�����������������������ʷԭ����С�ĺ��벢���Ǵ�1��ʼ�ŵġ�
��һ��С��ͻȻ��������Ȥ�����飺
�����ȥС���Ҳ��㣬��ͬ����������ƺż��������պ���100��
���ң�С���ҵ����ƺŸպõ��ں�ͬ������ס���ĸ�����

���������Щ��Ϣ������С���ҵ����ƺ��Ƕ��٣�

���ύ����������Ҫ��д�κζ�������ݻ�˵�������֡�
 * 
 * @author DELL
 *
 */
public class A1_��ͬ���ƺ� {
	public static void main(String[] args) {
		for(int i=2;i<20;i++) {
			int sum=0;
			int count=0;
			for(int j=i;j<20;j++) {
				count++;
				sum+=j;
				if(sum-count+1==100) System.out.println(count-1);
			}
		}
		
	}
}
