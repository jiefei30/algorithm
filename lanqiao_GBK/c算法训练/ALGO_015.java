package lanqiao_GBK.c算法训练

�㷨ѵ��;

import java.util.Scanner;

public class ALGO_015 {
	static int sum,n;
	static int[] data=new int[1000];
	static int[] book=new int[1000];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		bfs(0);
		System.out.println(sum);
		
	}
	public static void bfs(int t) {
		if(t>1){
			if(t==2){
	            sum++;
	        }
	        else if((data[t-2]-data[t-3])*(data[t-1]-data[t-3])<0){//�����±��Ǵ�0��ʼ�ģ�����Ҫ���ȥһ��1 
	            sum++;
	        }
	        else return ;
		}
		for(int i = 1;i <= n;i++){
			if(book[i]==0){
				data[t] = i;//��� 
				book[i] = 1;//��� 
				bfs(t+1);
				book[i] = 0;//���� 
			}
		}
	}
}
