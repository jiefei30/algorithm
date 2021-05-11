package lanqiao_GBK.b基础练习

������ϰ;
/**
 * FJ���ַ���  
 * @author DELL
 *
 */
import java.util.Scanner;

public class BASIC22 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(An(n));
	}
	public static String An(int n) {
		if(n==1) return "A";
		else return An(n-1) + (char)(65+n-1) + An(n-1);
	}
}
