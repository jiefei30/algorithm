package lanqiao.a3第八届国赛;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 我们知道，整数做除法时，有时得到有限小数，有时得到无限循环小数。
如果我们把有限小数的末尾加上无限多个0，它们就有了统一的形式。

本题的任务是：在上面的约定下，求整数除法小数点后的第n位开始的3位数。

输入：
 一行三个整数：a b n，用空格分开。a是被除数，b是除数，n是所求的小数后位置（0<a,b,n<1000000000）
输出：
一行3位数字，表示：a除以b，小数后第n位开始的3位数字。

比如：
输入：
1 8 1

程序应该输出：
125

再比如：
输入：
1 8 3

程序应该输出：
500

再比如：
输入：
282866 999000 6

程序应该输出：
914

资源约定：
峰值内存消耗 < 256M
CPU消耗  < 1000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
注意：不要使用package语句。不要使用jdk1.7及以上版本的特性。
注意：主类的名字必须是：Main，否则按无效代码处理。

----------------------------------------
笨笨有话说：
    这个除法小学就会算啊，模拟手算除法的过程就可以了吧。
	只是数有点大啊....
	管它呢，能算多远算多远....
	
歪歪有话说：
    如果我能确定循环节从哪里开始到哪里结束，再大的数不过就是与它取模的余数等价啊
 * @author DELL
 *
 */
public class C4_小数第n位 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		BigDecimal d = new BigDecimal(new String().valueOf(a));
		BigDecimal f = new BigDecimal(new String().valueOf(b));
		BigDecimal g =	d.divide(f,c+3, BigDecimal.ROUND_DOWN);
		String res = String.valueOf(g);
		System.out.println(res.substring(res.indexOf(".")+c,res.indexOf(".")+c+3));
	}
}
