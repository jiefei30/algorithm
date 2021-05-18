package other.classicalAlgorithm;



import java.util.Scanner;

public class LIS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] ori = new int[n];
		for(int i=0;i<n;i++) {
			ori[i] = sc.nextInt();
		}
		int[] dp = new int[n];
		dp[0] = ori[0];
		int index=1;
		for(int i=1;i<ori.length;i++) {
			if(ori[i]>=dp[index-1]) {
				for(int j=0;j<index;j++) {
					if(ori[i]>dp[j]) dp[j]=ori[i]; 
				}
			}else {
				dp[index] = ori[i];
				index++;
			}
		}
		System.out.println(index);
	}
}
