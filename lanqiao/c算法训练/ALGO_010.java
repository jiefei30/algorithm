package lanqiao.c算法训练;
/**
 * (集合运算
 */
import java.util.Arrays;
import java.util.Scanner;

public class ALGO_010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] A = new int[n];
		for(int i=0;i<n;i++) {
			A[i] = sc.nextInt();
		}
		int m=sc.nextInt();
		int[] B = new int[m];
		for(int i=0;i<m;i++) {
			B[i] = sc.nextInt();
		}
		int[] C = Arrays.copyOf(A, A.length+B.length);
		System.arraycopy(B, 0, C, A.length,B.length);
		Arrays.sort(C);
		for(int i=1;i<m+n;i++) {
			if(C[i] == C[i-1]) System.out.print(C[i]+" ");		
		}
		System.out.println();
		for(int i=0;i<m+n-1;i++) {
			if(C[i] == C[i+1]) continue;
			else System.out.print(C[i]+" ");
		}
		System.out.println(C[C.length-1]); 
		int[] D  =Arrays.copyOf(C, C.length+B.length);
		System.arraycopy(B, 0, D, C.length, B.length);
		Arrays.sort(D);
		if(D[0]!= D[1]) System.out.print(D[0]+" ");
		for(int i=1;i<D.length-1;i++) {
			if(D[i]!=D[i-1] && D[i]!=D[i+1]) System.out.print(D[i]+" "); 
		}
		if(D[D.length-1] != D[D.length-2]) System.out.println(D[D.length-1]);
	}
}
