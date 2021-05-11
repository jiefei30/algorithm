package lanqiao_GBK.a4第九届国赛

�ھŽ����;

/**
 * ��8öӲ���У���1ö�ٱң��ٱ���������һģһ����ֻ���������������һ�㡣
����һ����ƽ��Ҫ������3�Σ����ҳ��ٱң�����֪��������һЩ������һЩ��
����Ĵ������һ�������������ϸ�����߼�����д����λ��ȱ�ٵĴ��롣


import java.util.*;
public class Main
{
	static int balance(int a, int b){
		if(a<b) return -1;
		if(a>b) return 1;
		return 0;
	}
	
	static void judge(char[] data, int a, int b, int std){
		switch(balance(data[a],data[std])){
		case -1:
			System.out.println(a + " light");
			break;
		case 0:
			System.out.println(b + " heavy");
			break;
		case 1:
			System.out.println("err!");
		}
	}
	
	// data ��8��Ԫ�أ���һ���ٱң��������
	static void f(char[] data){
		switch( __________________________________________________ ){  //���
		case -1:
			switch(balance(data[0]+data[4],data[3]+data[1])){
				case -1:
					judge(data,0,3,1);
					break;
				case 0:
					judge(data,2,5,0);
					break;
				case 1:
					judge(data,1,4,0);
			}
			break;
		case 0:
			judge(data,6,7,0);		
			break;
		case 1:
			switch(balance(data[0]+data[4],data[3]+data[1])){
				case -1:
					judge(data,4,1,0);
					break;
				case 0:
					judge(data,5,2,0);
					break;
				case 1:
					judge(data,3,0,1);
			}
			break;		
		}	
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		
		for(int i=0; i<n; i++){
			f(scan.nextLine().trim().toCharArray());
		}
	}
}

 * @author DELL
 *
 */
public class A3_�Ҽٱ� {
	static int balance(int a, int b){
		if(a<b) return -1;
		if(a>b) return 1;
		return 0;
	}
	
	static void judge(char[] data, int a, int b, int std){
		switch(balance(data[a],data[std])){
		case -1:
			System.out.println(a + " light");
			break;
		case 0:
			System.out.println(b + " heavy");
			break;
		case 1:
			System.out.println("err!");
		}
	}
	
	// data ��8��Ԫ�أ���һ���ٱң��������
	static void f(char[] data){
		switch( balance(data[0]+data[1]+data[2], data[3]+data[4]+data[5]) ){  //���
		case -1:
			switch(balance(data[0]+data[4],data[3]+data[1])){
				case -1:
					judge(data,0,3,1);
					break;
				case 0:
					judge(data,2,5,0);
					break;
				case 1:
					judge(data,1,4,0);
			}
			break;
		case 0:
			judge(data,6,7,0);		
			break;
		case 1:
			switch(balance(data[0]+data[4],data[3]+data[1])){
				case -1:
					judge(data,4,1,0);
					break;
				case 0:
					judge(data,5,2,0);
					break;
				case 1:
					judge(data,3,0,1);
			}
			break;		
		}	
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		
		for(int i=0; i<n; i++){
			f(scan.nextLine().trim().toCharArray());
		}
	}
}
