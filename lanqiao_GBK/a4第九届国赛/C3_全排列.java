package lanqiao_GBK.a4第九届国赛�ھŽ����;
/**
 * ����ĳ���������磺��1234��������������ȫ���С�
����Ҫ����Щȫ����һ��Ҫ������ĸ���������С�
���ڡ�1234����Ӧ�����(һ��4!=24��)��
1234
1243
1324
1342
1423
1432
2134
2143
2314
2341
2413
2431
3124
3142
3214
3241
3412
3421
4123
4132
4213
4231
4312
4321

������ʵ�ֳ�������ϸ���������߼�������д���߲���ȱ�ٵĴ��롣

// �ֻ�ǰk�����ٵݹ鴦��
import java.util.*;
public class A
{
	static void permu(char[] data, int cur){
		if(cur==data.length-1){
			System.out.println(new String(data));
			return;
		}
		
		for(int i=cur; i<data.length; i++){
			char tmp = data[i]; 
			for(int j=i-1; j>=cur; j--) data[j+1] = data[j];
			data[cur] = tmp;			

			permu(data, cur+1);			

			tmp = data[cur]; 
			__________________________________________ ;
			data[i] = tmp;			
		}
	}
	
	static void permu(String x){
		permu(x.toCharArray(),0);
	}
	
	public static void main(String[] args){
		permu("1234");
	}
}
 * @author DELL
 *
 */
public class C3_ȫ���� {
	static void permu(char[] data, int cur){
		if(cur==data.length-1){
			System.out.println(new String(data));
			return;
		}
		
		for(int i=cur; i<data.length; i++){
			char tmp = data[i]; 
			for(int j=i-1; j>=cur; j--) data[j+1] = data[j];
			data[cur] = tmp;			

			permu(data, cur+1);			

			tmp = data[cur]; 
			for(int j=cur; j<=i-1; j++) data[j] = data[j+1];
			data[i] = tmp;			
		}
	}
	
	static void permu(String x){
		permu(x.toCharArray(),0);
	}
	
	public static void main(String[] args){
		permu("1234");
	}
}
