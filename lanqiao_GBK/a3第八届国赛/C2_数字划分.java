package lanqiao_GBK.a3第八届国赛�ڰ˽����;
/**
 * 
 * 
���⣺���ֻ���


w����ĳ��Ͻ���С��һ������
1,2,3...16 ��16�����ַ�Ϊ���顣
Ҫ��
���������ֵĺ���ͬ��
���ң��������ֵ�ƽ����Ҳ��ͬ��
���ң��������ֵ�������Ҳ��ͬ��

�������ü������ǿ�������������������⡣
���ύ1���ڵ��Ǹ�������������֡�

��Щ����Ҫ��С�������У��������ּ���һ���ո�ֿ���
�����ƣ�1 4 5 8 ...  �����Ĵ𰸡�

ע�⣬ֻ�ύ��һ�����֣���Ҫ��д�κζ�������ݡ�

----------------------------------------
�����л�˵��
    ֻҪһ����ĳ�Աȷ���ˣ���һ����ĳ�ԱҲ��ȷ���ˡ�ö��һ����ĳ�Ա�Ϳ����ˡ�
	ƾֱ����������ĳ�Ա��Ŀ�����̫��ɡ�
�����л�˵��
    ��Ȼ�� 1 ���ڵ��Ǹ��飬��ֻҪö��ʣ��ĳ�Ա�Ϳ����ˡ�
	ò�ƶ���8����Ա�Ŀ����Ժܴ󰡡�
 * @author DELL
 *
 */

public class C2_���ֻ��� {
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
