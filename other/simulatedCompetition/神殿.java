package other.simulatedCompetition;


import java.util.Scanner;

public class 神殿 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int n = 0, num = l;
		String l1 = Integer.toBinaryString(l);
		String r2 = Integer.toBinaryString(r);
		for (int p = r; p >l; p--) {
//			s=Integer.toBinaryString(p);
//			if(!s.contains("0")) {
//				num=p;
//				break;
//			}else {
//				
//			}
//			if (s.length() > n) {
//				n = s.length();
//				num = p;
//			}
//			s = "";
		}
		System.out.println(num);
	}
}
