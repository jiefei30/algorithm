package lanqiao.b基础练习;
/**
 * 时间转换
 */
import java.util.Scanner;

public class BASIC14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int h = n/3600;
		int m = (n%3600)/60;
		int s =n%60;
		System.out.println(h+":"+m+":"+s);
	}
}
