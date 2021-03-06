package lanqiao.a2第七届国赛;

import java.util.HashSet;

/**
 * 
平方末尾

能够表示为某个整数的平方的数字称为“平方数”
比如，25,64
虽然无法立即说出某个数是平方数，但经常可以断定某个数不是平方数。
因为平方数的末位只可能是：[0, 1, 4, 5, 6, 9] 这6个数字中的某个。
所以，4325435332必然不是平方数。

如果给你一个2位或2位以上的数字，你能根据末位的两位来断定它不是平方数吗？

请计算一下，一个2位以上的平方数的最后两位有多少种可能性？

注意：需要提交的是一个整数，表示2位以上的平方数最后两位的不同情况数。
不要填写任何多余内容（比如，说明解释文字等）
 * @author DELL
 *
 */
public class C1_平方末尾 {
	public static void main(String[] args) {
		int n;
		String str;
		HashSet<String> hset = new HashSet<String>();
		for(int i=10;i<=100;i++) {
			n=i*i;
			str = n+"";
			hset.add(str.charAt(str.length()-2)+""+str.charAt(str.length()-1));
		}
		System.out.println(hset.size());
		
	}
}
