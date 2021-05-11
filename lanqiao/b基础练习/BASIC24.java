package lanqiao.b基础练习

»ù´¡Á·Ï°;
/*
 *   ¹êÍÃÈüÅÜÔ¤²â
 */
import java.util.Scanner;

public class BASIC24 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
		int l = sc.nextInt();
		int x1=0,x2=0,start=0,i=0;
		boolean rest=false;
		for(;x1<l&&x2<l;i++) {
			if(!rest) 	x1+=v1;
			else if(i==start) rest=false;
			x2+=v2;
			if((x1-x2)>=t && !rest) {
				rest=true;
				start=i+s;
			}
		}
		if(x1>=l&&x2<l) {
			System.out.println("R");
		}else if(x2>=l&&x1<l) {
			System.out.println("T");
		}else System.out.println("D");
		System.out.println(i);
	}
}
