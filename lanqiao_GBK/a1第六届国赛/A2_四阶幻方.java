package lanqiao_GBK.a1第六届国赛

���������;

/**
 * 
 * ���⣺�Ľ׻÷�

��1~16����������4x4�ķ����У�ʹ���С����Լ������Խ��ߵĺͶ���ȣ���������������ʱ��Ϊ���Ľ׻÷���

�Ľ׻÷������кܶ෽��������̶����Ͻ�Ϊ1�������һ���ж����ַ�����
���磺
  1  2 15 16
 12 14  3  5
 13  7 10  4
  8 11  6  9

�Լ���
  1 12 13  8       1  12  13  8  2  14  7  11  15  3  10  6  16  5  4  9
  2 14  7 11	   0  1   2   3  4  5   6   7   8  9  10  11  12 13 14 15
 15  3 10  6
 16  5  4  9
 
�Ϳ�����Ϊ���ֲ�ͬ�ķ�����

���ύ���Ͻǹ̶�Ϊ1ʱ�����з������֣���Ҫ��д�κζ������ݻ�˵�����֡�
 * @author DELL
 *
 */
public class A2_�Ľ׻÷� {
	static int res=34;
	static int count;
	static int test2=0;
	static int[] arr = new int[16]; 
	static int[][] manage = {
			{0,1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14,15},{0,4,8,12},{1,5,9,13},{2,6,10,14},{3,7,11,15},{0,5,10,15},{3,6,9,12}	
	};
	public static void main(String[] args) {
		for(int i=0;i<16;i++) {
			arr[i]=i+1;
		}
		dfs(1);
		System.out.println(count);
	}
	public static void dfs(int k) {
		if(k%4==0 && k>3) {
			test2=0;
			for(int i=k-4;i<k;i++) {
				test2+=arr[i];
			}
			if(test2!=34)return;
		}
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
		int test =0;
		for(int i=4;i<10;i++) {
			test=0;
			for(int j=0;j<4;j++) {
				test+=arr[manage[i][j]]; 
			}
			if(test!=34)return false; 
		}
		return true;
	}
}
