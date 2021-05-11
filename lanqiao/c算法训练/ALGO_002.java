package lanqiao.c算法训练;
/**
 * 
 * (最大最小公倍数
 */
import java.util.Scanner;

public class ALGO_002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		if(N%2!=0) 	System.out.println(N*(N-1)*(N-2));
		else if(N%3!=0) System.out.println(N*(N-1)*(N-3));
			else System.out.println((N-1)*(N-2)*(N-3));
	}
}
