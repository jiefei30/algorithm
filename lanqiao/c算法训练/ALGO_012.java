package lanqiao.c算法训练;
import java.util.LinkedList;
/**
 * (幂方分解
 * 问题描述
　　任何一个正整数都可以用2的幂次方表示。例如：
　　137=27+23+20 
　　同时约定方次用括号来表示，即ab 可表示为a（b）。
　　由此可知，137可表示为：
　　2（7）+2（3）+2（0）
　　进一步：7= 22+2+20 （21用2表示）
　　3=2+20 
　　所以最后137可表示为：
　　2（2（2）+2+2（0））+2（2+2（0））+2（0）
　　又如：
　　1315=210 +28 +25 +2+1
　　所以1315最后可表示为：
　　2（2（2+2（0））+2）+2（2（2+2（0）））+2（2（2）+2（0））+2+2（0）
输入格式
　　输入包含一个正整数N（N<=20000），为要求分解的整数。
输出格式
　　程序输出包含一行字符串，为符合约定的n的0，2表示（在表示中不能有空格）
 */
import java.util.Scanner;


//public class ALGO_012 {
//	public static String str="";
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println(transform(sc.nextInt()));
//	}
//	public static String transform(int number) {
//		if(number==0)return "";
//		String str1="";
//		int mi=0;	
//		int yu=0;
//		if(number>2) {
//			int current=2;
//			for(;current<=number;mi++) {
//				current = current*2;
//			}	
//			yu = number-current/2;
//			if(mi==1)str1= "2";
//			else str1=transform(mi);
//		}else {
//			if(number==1)return "2(0)";
//			else if(number==2) return "2";
//		}
//		return str=str+str1+"+"+transform(yu);
//	}
//}



public class ALGO_012
{
	public static void main(String args[])
	{
		Scanner cn=new Scanner (System.in);
		int n=cn.nextInt();	
		System.out.println(kk(n));
	}
	public static String kk(int n)
	{
		LinkedList<Integer> list=new LinkedList<Integer>();   //放置余数
		String str=new String("");
		int t,u=n;
		while(true)
		{
			t=u%2;
			u=u/2;
			list.add(t);
			if(u==0)break;
		}
		int count=0;
		for(int i=list.size()-1;i>=0;i--)
		{
			if(list.get(i)==1)
			{			
				if(count>0)str=str+"+";		 //控制str顶端第一次没有+号    	
				if(i==1)str=str+2;
				if(i==0)str=str+"2(0)";
				if(i!=0&&i!=1)str=str+"2("+kk(i)+")";	//进行递归求解				
				count=1;
			}
		}
		return str;    
	}
}
