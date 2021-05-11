package other.周算法题;

/**
 * Լɪ������
 * �ݹ�+����
 */
import java.util.Scanner;

public class T4_3 {
	static int m,t=1,n;				//t�Ǽ�¼�������
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] arr = new int[n];
		boolean[] isOut  = new boolean[n];
		for(int i=0;i<n;i++) {
			arr[i]=t++;
			isOut[i] = false;
		}
		t=0;
		out(arr,isOut,0);
	}
	public static void out(int[] arr,boolean[] isOut,int index) {
		if(t==n) return;
		else for(int i=0;i<m;) {
			if(!isOut[index]) {
				if(i==m-1) {
					System.out.println(arr[index]);
					isOut[index] = true;
					t++;
					index++;
					if(index > n-1) index=0; 
					out(arr,isOut,index);
				}
				i++;
			}
			index++;
			if(index > n-1) index=0; 
			
		}
	}
}
