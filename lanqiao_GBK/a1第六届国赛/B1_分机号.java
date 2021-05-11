package lanqiao_GBK.a1第六届国赛���������;

public class B1_�ֻ��� {
	public static void main(String[] args) {
		int count=0;
		for(int i=2;i<=9;i++) {
			for(int j=1;j<i;j++) {
				for(int k=0;k<j;k++) {
					if(i>j&&j>k)count++;
				}
			}
		}
		System.out.println(count);
	}
}
