package lanqiao.a1第六届国赛;
/**
 * 标题：胡同门牌号

小明家住在一条胡同里。胡同里的门牌号都是连续的正整数，由于历史原因，最小的号码并不是从1开始排的。
有一天小明突然发现了有趣的事情：
如果除去小明家不算，胡同里的其它门牌号加起来，刚好是100！
并且，小明家的门牌号刚好等于胡同里其它住户的个数！

请你根据这些信息，推算小明家的门牌号是多少？

请提交该整数，不要填写任何多余的内容或说明性文字。
 * 
 * @author DELL
 *
 */
public class A1_胡同门牌号 {
	public static void main(String[] args) {
		for(int i=2;i<20;i++) {
			int sum=0;
			int count=0;
			for(int j=i;j<20;j++) {
				count++;
				sum+=j;
				if(sum-count+1==100) System.out.println(count-1);
			}
		}
		
	}
}
