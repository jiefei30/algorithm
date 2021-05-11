package lanqiao_GBK.a2第七届国赛���߽����;
/**
 * 
 * 
��������

��ͼ��ͼ1.png����ʾ��

���߽��ǵ�14���ڵ�������1~14 �����֣����ظ�������©��
Ҫ��ÿ��ֱ���ϵ��ĸ�����֮�ͱ�����ȡ�

ͼ���Ѿ�������3�����֡�
���������λ��Ҫ�������֣���Ψһ��

��ú����ύ��ɫ�ڵ��4�����֣������ң��ÿո�ֿ���

���磺12 5 4 8
��Ȼ���ⲻ����ȷ�Ĵ𰸡�

ע�⣺ֻ�ύ4���ÿո�ֿ������֣���Ҫ��д�κζ�������ݡ�
 * @author DELL
 *
 */
public class C2_�������� {
	static int[] arr = new int[14]; 
	static 	int[][] line = {{0,7,8,2},{1,7,13,6},{1,8,9,3},{2,9,10,4},{3,10,11,5},{4,11,12,6}};
	public static void main(String[] args) {
		for(int i=0;i<14;i++) {
			arr[i] = i+1;
		}
		dfs(0);
	}
	public static void dfs(int k) {
		if(k==1) if(arr[0]!=6)return;
		if(k==3) if(arr[2]!=11)return;
		if(k==6) if(arr[5]!=14)return;
		if(k==arr.length&&ok())System.out.println(arr[6]+" "+arr[13]+" "+arr[7]+" "+arr[1]);
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
		int res = arr[0]+arr[13]+arr[12]+arr[5];
		int test =0;
		for(int i=0;i<6;i++) {
			test=0;
			for(int j=0;j<4;j++) {
				test+=arr[line[i][j]]; 
			}
			if(test!=res)return false; 
		}
		return true;
	}
}
