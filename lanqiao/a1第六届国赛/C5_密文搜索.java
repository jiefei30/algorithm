package lanqiao.a1第六届国赛;

import java.util.Scanner;

/**
 * 
标题：密文搜索

福尔摩斯从X星收到一份资料，全部是小写字母组成。
他的助手提供了另一份资料：许多长度为8的密码列表。
福尔摩斯发现，这些密码是被打乱后隐藏在先前那份资料中的。

请你编写一个程序，从第一份资料中搜索可能隐藏密码的位置。要考虑密码的所有排列可能性。

数据格式：

输入第一行：一个字符串s，全部由小写字母组成，长度小于1024*1024
紧接着一行是一个整数n,表示以下有n行密码，1<=n<=1000
紧接着是n行字符串，都是小写字母组成，长度都为8

要求输出：
一个整数, 表示每行密码的所有排列在s中匹配次数的总和。

例如：
用户输入：
aaaabbbbaabbcccc
2
aaaabbbb
abcabccc

则程序应该输出：
4

这是因为：第一个密码匹配了3次，第二个密码匹配了1次，一共4次。
 * @author DELL
 *
 */
public class C5_密文搜索 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	}
}
