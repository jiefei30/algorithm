package lanqiao.a3第八届国赛;
/**
 * 
 * 
标题：数字划分


w星球的长老交给小明一个任务：
1,2,3...16 这16个数字分为两组。
要求：
这两组数字的和相同，
并且，两组数字的平方和也相同，
并且，两组数字的立方和也相同。

请你利用计算机的强大搜索能力解决这个问题。
并提交1所在的那个分组的所有数字。

这些数字要从小到大排列，两个数字间用一个空格分开。
即类似：1 4 5 8 ...  这样的答案。

注意，只提交这一组数字，不要填写任何多余的内容。

----------------------------------------
笨笨有话说：
    只要一个组的成员确定了，另一个组的成员也就确定了。枚举一个组的成员就可以了。
	凭直觉，两个组的成员数目不会差太多吧。
歪歪有话说：
    既然求 1 所在的那个组，那只要枚举剩余的成员就可以了。
	貌似都是8个成员的可能性很大啊。
 * @author DELL
 *
 */

public class C2_数字划分 {
	static int sum1,sum2,c1,c2,l1,l2;
	static int judge;
	static int[] arr;
	public static void main(String[] args) {
		arr = new int[17];
		for(int i=0;i<17;i++) {
			arr[i]=i;
		}
		boolean[] isUsed = new boolean[17];
		isUsed[0] = true;
		dfs(isUsed,1);
	}
	public static void dfs(boolean[] isUsed,int index) {
		for(int i=1;i<17;i++) {
			if(isUsed[i]) {
				sum1+=arr[i];
				c1+=arr[i]*arr[i];
				l1 += arr[i]*arr[i]*arr[i];
			}else {
				sum2+=arr[i];
				c2+=arr[i]*arr[i];
				l2 += arr[i]*arr[i]*arr[i];
			}
		}
		if(sum1==sum2 && c1==c2 &&l1==l2) {
			for(int i=1;i<17;i++) {
				if(isUsed[i]) {
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
		}else {
			sum1=0;
			sum2=0;
			c1=0;
			c2=0;
			l1=0;
			l2=0;
		}
		if(index==17) return;
		else {
				for(int j=0;j<2;j++) {
					if(j==0) {
						isUsed[index] = true;
						dfs(isUsed,index+1);
						isUsed[index] = false;
					}else {
						dfs(isUsed,index+1);
					}
				}	
		}
		
	}
}
