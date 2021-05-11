package lanqiao.b基础练习;
/*
 *     	数的读法
 */
import java.util.Scanner;

public class BASIC20 {
	static String[] number = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
	static String[] danWei = {"qian","bai","shi",""};
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str = sc.next();
		int length = str.length();
		if(length<=4) print(str,0);
		else if(length<=8) {
			print(str.substring(0, str.length()-5),1);
			print(str.substring(str.length()-4),0);
		}else {
			print(str.substring(0, str.length()-8),2);
			print(str.substring(str.length()-8, str.length()-5),1);
			print(str.substring(str.length()-4),0);
		}
	}
	public static void  print(String n,int index) {
		int l = n.length();
		if(Integer.parseInt(n) ==0 && index==0) return;
		if(Integer.parseInt(n) ==0  && index!=0) {
			System.out.print("ling"+" ");
			return;
		}
		int current;
		for(int j=0,i=4-l;i<4;i++,j++) {
			current=Integer.parseInt(n.charAt(j)+"");
//			if(j==1 && Integer.parseInt(n.substring(1),2)==0) return;
			if(n.charAt(j)=='0') {
				if(Integer.parseInt(n.substring(j),2)==0) break;
					if(index!=0) System.out.print("ling"+" ");
					else if(n.charAt(j-1)=='0'&&j>0) continue;
					else System.out.print("ling"+" ");
					continue;
			}
			System.out.print(number[current]+" "+danWei[i]+" ");
		}
		if(index==2) System.out.print("yi"+" ");
		if(index==1) System.out.print("wan"+" ");
	}
}
