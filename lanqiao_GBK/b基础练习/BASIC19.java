package lanqiao_GBK.b基础练习

������ϰ;

import java.util.Scanner;
/**
 * �����Ĵ���  ����ʱ��
 * @author DELL
 *
 */
public class BASIC19 {
	static int res=0,length;
	static boolean is=false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		length = sc.nextInt();
		String str = sc.next();
		char[] chr = str.toCharArray();
		opt(chr,0,0);
		if(is)System.out.println(res);
		else System.out.println("Impossible");
	}
	public static void opt(char[] arr,int index,int count) {
		char t;
		if(index == length-1) {
			if(judge(arr)) {
				if(res==0) {
					res =count;
					is=true;
					}
				else res = count<res?count:res;	
			}
			return ;
		}
		for(int i=0;i<2;i++) {
			if(i==0) {
				t = arr[index];
				arr[index] = arr[index+1];
				arr[index+1] = t;
				opt(arr,index+1,count+1);
			}else {
				t = arr[index];
				arr[index] = arr[index+1];
				arr[index+1] = t;
				opt(arr,index+1,count);
			}
		}
		
	}
	public static boolean judge(char[] arr) {
		for(int i=0;i<(length-length%2)/2;i++) {
			if(arr[i]!=arr[length-1-i]) return false;
		}
		return true;
	}
}
