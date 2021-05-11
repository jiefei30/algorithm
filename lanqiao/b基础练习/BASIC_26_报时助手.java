package lanqiao.b基础练习;
/**
 * 报时助手
 */
import java.util.Scanner;

public class BASIC_26_报时助手 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		if(a<=9) {
			ge(a);
		}else if(a<20) {
			shi(a);
		}else{
			switch(a) {
			case 20:System.out.print("twenty");break;
			case 21:System.out.print("twenty one");break;
			case 22:System.out.print("twenty two");break;
			case 23:System.out.print("twenty three");break;
			}
		}
		System.out.print(" ");
		if(b==0) {
			System.out.print("o'clock");
		}else if(b<=9) {
			ge(b);
		}else if(b<=19) {
			shi(b);
		}else{
			switch((int)b/10) {
			case 2:System.out.print("twenty");break;
			case 3:System.out.print("thirty");break;
			case 4:System.out.print("forty");break;
			case 5:System.out.print("fifty");break;
			}
		}
		System.out.print(" ");
		if((b-((int)b/10)*10)!=0 && b>=20) {
			ge(b%10);
		}
	}
	public static void ge(int i) {
		switch(i) {
		case 0:System.out.print("zero");break;
		case 1:System.out.print("one");break;
		case 2:System.out.print("two");break;
		case 3:System.out.print("three");break;
		case 4:System.out.print("four");break;
		case 5:System.out.print("five");break;
		case 6:System.out.print("six");break;
		case 7:System.out.print("seven");break;
		case 8:System.out.print("eight");break;
		case 9:System.out.print("nine");break;
		}
	}
	public static void shi(int i) {
		switch(i) {
		case 10:System.out.print("ten");break;
		case 11:System.out.print("eleven");break;
		case 12:System.out.print("twelve");break;
		case 13:System.out.print("thirteen");break;
		case 14:System.out.print("fourteen");break;
		case 15:System.out.print("fifteen");break;
		case 16:System.out.print("sixteen");break;
		case 17:System.out.print("seventeen");break;
		case 18:System.out.print("eighteen");break;
		case 19:System.out.print("nineteen");break;
		}
	}
}
