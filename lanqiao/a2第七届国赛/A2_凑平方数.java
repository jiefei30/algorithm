package lanqiao.a2第七届国赛;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 把0~9这10个数字，分成多个组，每个组恰好是一个平方数，这是能够办到的。
比如：0, 36, 5948721

再比如：
1098524736
1, 25, 6390784
0, 4, 289, 15376
等等...

注意，0可以作为独立的数字，但不能作为多位数字的开始。
分组时，必须用完所有的数字，不能重复，不能遗漏。

如果不计较小组内数据的先后顺序，请问有多少种不同的分组方案？
 * @author DELL
 *
 */
public class A2_凑平方数 {
	static int count=0;
	public static void main(String[] args) {
		ArrayList<Long> arr = new ArrayList<Long>();
		HashSet<String> number = new HashSet<String>();
		long max = Long.parseLong("9876543210");
		long cur=0;
		String cur2="";
		for(long i=0;cur<max;i++) {
			number.removeAll(number);
			cur = i*i;
			cur2 = cur+"";
			for(int j=0;j<cur2.length();j++) {
				number.add(cur2.charAt(j)+"");
			}
			if(number.size()==cur2.length())arr.add(cur);
		}
		System.out.println(arr.size());
	}
	public static void dfs() {
		
	}
}
