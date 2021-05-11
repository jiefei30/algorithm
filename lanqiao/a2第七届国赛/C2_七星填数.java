package lanqiao.a2第七届国赛;
/**
 * 
 * 
七星填数

如图【图1.png】所示。

在七角星的14个节点上填入1~14 的数字，不重复，不遗漏。
要求每条直线上的四个数字之和必须相等。

图中已经给出了3个数字。
请计算其它位置要填充的数字，答案唯一。

填好后，请提交绿色节点的4个数字（从左到右，用空格分开）

比如：12 5 4 8
当然，这不是正确的答案。

注意：只提交4个用空格分开的数字，不要填写任何多余的内容。
 * @author DELL
 *
 */
public class C2_七星填数 {
	static int[] arr = new int[14]; 
	static 	int[][] line = {{0,7,8,2},{1,7,13,6},{1,8,9,3},{2,9,10,4},{3,10,11,5},{4,11,12,6}};
	public static void main(String[] args) {
		for(int i=0;i<14;i++) {
			arr[i] = i+1;
		}
		dfs(0);
	}
	public static void dfs(int k) {
		if(k==1) if(arr[0]!=6)return;
		if(k==3) if(arr[2]!=11)return;
		if(k==6) if(arr[5]!=14)return;
		if(k==arr.length&&ok())System.out.println(arr[6]+" "+arr[13]+" "+arr[7]+" "+arr[1]);
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
	public static boolean ok() {
		int res = arr[0]+arr[13]+arr[12]+arr[5];
		int test =0;
		for(int i=0;i<6;i++) {
			test=0;
			for(int j=0;j<4;j++) {
				test+=arr[line[i][j]]; 
			}
			if(test!=res)return false; 
		}
		return true;
	}
}
