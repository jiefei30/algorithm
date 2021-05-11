package lanqiao.a1第六届国赛;
/**
 * 标题：生成回文数

所谓回文数就是左右对称的数字，比如：
585,5885,123321...
当然，单个的数字也可以算作是对称的。

小明发现了一种生成回文数的方法：
比如，取数字19，把它与自己的翻转数相加：
19 + 91 = 110，如果不是回文数，就再进行这个过程：
110 + 011 = 121 这次是回文数了。

200以内的数字中，绝大多数都可以在30步以内变成回文数，只有一个数字很特殊，就算迭代了1000次，它还是顽固地拒绝回文！

请你提交该顽固数字，不要填写任何多余的内容。
 * @author DELL
 *
 */
public class C2_生成回文数 {
	static int count=0;
	static long number=10;
	public static void main(String[] args) {
		for(;number<=200;number++) {
			System.out.println(number);
			find(number);
		}
		
	}
	public static void find(long n) {
		if(count<1000) {
			if(isHuiWen(n)) {
				count++;
				return;
			}else {
				find(n+fanzhuan(n));
			}
		}else return;
	}

	public static long fanzhuan(long n) {
		String s = n+"";
		char[] cha = s.toCharArray();
		String s2="";
		for(int i=0;i<cha.length;i++) {
			s2+=cha[cha.length-1-i];
		}
		if(s2.charAt(0)=='0') {
			s2 = s2.substring(1);
			if(s2.charAt(0)=='0') {
				s2 = s2.substring(1);
			}
		}
		return Long.parseLong(s2);
	}
	public static boolean isHuiWen(long n) {
		String huiwen = n+"";
		int l;
		char[] cha = huiwen.toCharArray();
		if(cha.length%2==0) l=cha.length/2;
		else l = (cha.length-1)/2;
		for(int i=0;i<l;i++) {
			if(cha[i]!=cha[cha.length-1-i]) return false;
		}
		return true;
	}
}
