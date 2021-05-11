package other.经典算法;



import java.util.Scanner;

public class 全排列 {
	public static int[] arr = new int[5];
	public static int count=0;
	public static void main(String[] args) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		dfs(0);
		System.out.println(count);
	}
	public static void dfs(int k) {
		if(k==arr.length) count++;
		else {
			for(int i=k;i<arr.length;i++) {
				swap(k,i);      //����
				dfs(k+1);		//�ݹ�
				swap(k,i);      //����
			}
		}
	}
	public static void swap(int k,int i) {
		int t = arr[k];
		arr[k] = arr[i];
		arr[i] =t;
	}
}
