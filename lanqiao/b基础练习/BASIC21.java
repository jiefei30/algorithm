package lanqiao.b基础练习;
/**
 *  sin之舞 （会超时）
 */
import java.util.Scanner;

public class BASIC21 {
	static int N;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		N=sc.nextInt();
		System.out.println(Sn("",N,1));
	}
	public static String An(String res,int n,int m) {
		if(m<n) {
			if(m%2==0) return "sin("+m+"+"+An(res,n,m+1)+")";
			else return "sin("+m+"-"+An(res,n,m+1)+")";
		}else return "sin("+n+")";
	}
	public static String Sn(String res,int n,int m) {
		if(n==1) return An("",n,1)+"+"+N;
		else return "("+Sn("",n-1,m+1)+")"+An("",n,1)+"+"+m;
	}
}
