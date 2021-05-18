package other.weeklyAlgorithm;

/**
 * Լɪ������
 * ����+����
 */
import java.util.Scanner;

public class T4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int t=1,index=0;
		boolean[] isOut  = new boolean[n];
		for(int i=0;i<n;i++) {
			arr[i]=t++;
			isOut[i] = false;
		}
		t=0;
		while(t<n) {
			for(int i=0;i<m;) {
				if(!isOut[index]) {
					if(i==m-1) {
						System.out.println(arr[index]);
						isOut[index] = true;
						t++;
						if(index > n-1) index=0; 
					}
					i++;
				}
				index++;
				if(index > n-1) index=0; 
				
			}
		}
	}
}
