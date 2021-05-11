package lanqiao_GBK.a2第七届国赛

���߽����;

/**
 * ��0~9��10�����֣��ֳɶ���飬ÿ����ǡ����һ��ƽ�����������ܹ��쵽�ġ�
���磺0, 36, 5948721

�ٱ��磺
1098524736
1, 25, 6390784
0, 4, 289, 15376
�ȵ�...

ע�⣬0������Ϊ���������֣���������Ϊ��λ���ֵĿ�ʼ��
����ʱ�������������е����֣������ظ���������©��

������ƽ�С�������ݵ��Ⱥ�˳�������ж����ֲ�ͬ�ķ��鷽����
 * @author DELL
 *
 */
public class A2_��ƽ���� {
	static int count=0;
	public static void main(String[] args) {
		ArrayList<Long> arr = new ArrayList<Long>();
		HashSet<String> number = new HashSet<String>();
		long max = Long.parseLong("9876543210");
		long cur=0;
		String cur2="";
		for(long i=0;cur<max;i++) {
			number.removeAll(number);
			cur = i*i;
			cur2 = cur+"";
			for(int j=0;j<cur2.length();j++) {
				number.add(cur2.charAt(j)+"");
			}
			if(number.size()==cur2.length())arr.add(cur);
		}
		System.out.println(arr.size());
	}
	public static void dfs() {
		
	}
}
