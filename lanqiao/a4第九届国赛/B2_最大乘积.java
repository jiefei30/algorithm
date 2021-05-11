package lanqiao.a4第九届国赛;

import java.util.HashSet;

/**
 * 把 1~9 这9个数字分成两组，中间插入乘号，
有的时候，它们的乘积也只包含1~9这9个数字，而且每个数字只出现1次。

比如：
984672 * 351 = 345619872
98751 * 3462 = 341875962
9 * 87146325 = 784316925
...

符合这种规律的算式还有很多，请你计算在所有这些算式中，乘积最大是多少？

 * @author DELL
 *
 */
public class B2_最大乘积 {
	static int[] arr = new int[9]; 
	static long res=0;
	public static void main(String[] args) {
		for(int i=0;i<9;i++) {
			arr[i]=i+1;
		}
//		int a=0;
//		for(int i=49;i<=57;i++) {
//			a+=i;
//		}
//		System.out.println(a);
		dfs(0);
		System.out.println(res);
	}
	public static void dfs(int k) {
		if(k==arr.length)test();
		else {
			for(int i=k;i<arr.length;i++) {
				swap(k,i);
				dfs(k+1);
				swap(k,i);
			}
		}
	}
	public static void swap(int k,int i) {
		int t = arr[k];
		arr[k] = arr[i];
		arr[i] = t;
	}
	public static void test() {  
		String s1 ="",s2="";
		long cur;
		int a;
		for(int i=0;i<9;i++) s1+=arr[i];
		for(int i=0;i<8;i++) {
			cur = Integer.parseInt(s1.substring(0, i+1))*Integer.parseInt(s1.substring(i+1));
			s2=cur+"";
			if(s2.length()==9) {
				HashSet<String> hset = new HashSet<String>();
				a=0;
				for(int j =0 ;j<9;j++) {
					a+=(int)s2.charAt(j);
					hset.add(s2.charAt(j)+"");
				}
				if(a==477 && hset.size()==9) res = cur>res?cur:res;
			}
		}
	}
}
