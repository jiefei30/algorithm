package lanqiao.a入门训练;
/**
 * 汉诺塔
 */
import java.util.Scanner;

public class 汉诺塔 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëººÅµËşµÄ²ãÊı");
		int n = sc.nextInt();
		move(n,'x','y','z');
	}
	public static void move(int n,char one,char two,char three) {
		if(n==1) {
			System.out.println(one+"--"+three);
		}else {
			move(n-1,one,three,two);
			System.out.println(one+"--"+three);
			move(n-1,two,one,three);
		}
	}
}
