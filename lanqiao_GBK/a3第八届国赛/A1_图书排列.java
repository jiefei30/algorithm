package lanqiao_GBK.a3第八届国赛

�ڰ˽����;

/**
 * �����Ϊ1~10��10�����ŷ�������ϣ�Ҫ�������ڵ��鲻�ܷ������ڵ�λ�á�
�����һ���ж����ֲ�ͬ�����з�����
 * @author DELL
 *
 */
public class A1_ͼ������ {
	static int count;
	static int[] arr = new int[10]; 
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			arr[i]=i+1;
		}
		dfs(0);
		System.out.println(count);
	}
	public static void dfs(int k) {
		if(k==arr.length && ok())count++;
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
		for(int i=0;i<9;i++) {
			if(arr[i]==arr[i+1]-1 ||arr[i]==arr[i+1]+1) return false;
		}
		return true;
	}
}
