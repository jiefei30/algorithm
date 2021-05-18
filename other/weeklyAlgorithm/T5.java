package other.weeklyAlgorithm;

/**
 * (��ת����
 */
import java.util.Scanner;

public class T5 {
	public static int maxRotateFunction(int[] A) {
	       int length = A.length;
			int sum=0,max=0,fn=0;
	        for(int i=0;i<length;i++) {
	        	sum+= A[i];
	        	fn += i*A[i];
	        }
	        max = fn;
	        for(int i=1;i<length;i++) {
	        	fn = fn + sum - length*A[length-i];
	        	if(fn>max) max=fn;
	        }
	        return max;
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] B = {4, 3, 2, 6};
		System.out.println(maxRotateFunction(B));
	}
}
