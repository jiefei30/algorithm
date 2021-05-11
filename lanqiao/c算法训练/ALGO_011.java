package lanqiao.c算法训练

·¨ÑµÁ·;
/**
 * (´É×©ÆÌ·Å
 */
import java.util.Scanner;

public class ALGO_011 {
	static int count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		puZhuan(sc.nextInt());
		System.out.println(count);
	}
	public static void puZhuan(int length) {
		if(length==0) {
			count++;
			return;
		}
		for(int i=0;i<2;i++) {
			if(i==0) 	puZhuan(length-1);
			else if(length>=2) puZhuan(length-2);	
		}
	}
}

