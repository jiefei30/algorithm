package lanqiao.a2第七届国赛;

import java.math.BigInteger;

/**
 * 
9的阶乘等于：362880
它的二进制表示为：1011000100110000000
这个数字共有19位。

请你计算，9999 的阶乘的二进制表示一共有多少位？
 */
public class A1_阶乘位数 {
	public static void main(String[] args) {
		BigInteger a = new BigInteger("1");
		for(int i=9999;i>0;i--) {
			a = a.multiply(BigInteger.valueOf(i));
		}
		String str = new BigInteger(String.valueOf(a),10).toString(2);
		System.out.println(str.length());
	}
}
