package lanqiao.a3第八届国赛;
/**
 * 由0~9这10个数字不重复、不遗漏，可以组成很多10位数字。
这其中也有很多恰好是平方数（是某个数的平方）。

比如：1026753849，就是其中最小的一个平方数。

请你找出其中最大的一个平方数是多少？

注意：你需要提交的是一个10位数字，不要填写任何多余内容。
 * @author DELL
 *
 */
public class B1_平方十位数 {
	public static void main(String[] args) {
		long test = 987654321;
		for(long i=99900;i>99000;i--) {
			if(i*i<test*10) {
				System.out.println(i);
				return;
			}
		}
	}
}
