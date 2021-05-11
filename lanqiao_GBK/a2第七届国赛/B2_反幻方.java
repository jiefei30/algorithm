package lanqiao_GBK.a2第七届国赛

���߽����;

/**
 * 
���÷�

�ҹ��ż�����ͼ�����

2 9 4
7 5 3
6 1 8

����һ�����׻÷���ÿ��ÿ���Լ��Խ����ϵ�������Ӷ���ȡ�

���濼��һ���෴�����⡣
�ɲ������� 1~9 ����������Ź���
ʹ�ã�ÿ��ÿ��ÿ���Խ����ϵ����ֺͶ���������أ�


��Ӧ����������
���磺
9 1 2
8 4 3
7 5 6

����������������е����׷��÷�����ͳ�Ƴ�һ���ж����֡�
��ת������ͬһ�֡�

���磺
9 1 2
8 4 3
7 5 6

7 8 9
5 4 1
6 3 2

2 1 9
3 4 8
6 5 7

�ȶ�����ͬһ�������

���ύ���׷��÷�һ�������֡�����һ����������Ҫ��д�κζ������ݡ�
 * @author DELL
 *
 */
public class B2_���÷� {
	static int count;
	static int[] arr = new int[9]; 
	static int[][] manage = {
			{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}	
	};
	public static void main(String[] args) {
		for(int i=0;i<9;i++) {
			arr[i]=i+1;
		}
		dfs(0);
		System.out.println(count/8);
	}
	public static void dfs(int k) {
		if(k==arr.length&&ok())count++;
		else {
			for(int i=k;i<arr.length;i++) {
				swap(k,i);
				dfs(k+1);
				swap(k,i);
			}
		}
	}
	public static void swap(int k,int i) {
		int t = arr[k];
		arr[k] = arr[i];
		arr[i] = t;
	}
	public static boolean ok() {
		HashSet<Integer> row = new HashSet<Integer>();
		int test =0;
		for(int i=0;i<8;i++) {
			test=0;
			for(int j=0;j<3;j++) {
				test+=arr[manage[i][j]];
			}
			row.add(test);
		}
		if(row.size()!=8)return false;
		else return true;
	}
}
