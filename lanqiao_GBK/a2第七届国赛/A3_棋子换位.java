package lanqiao_GBK.a2第七届国赛���߽����;
/**
 * ��n������A��n������B�����������ų�һ�С�
�����м����һ����λ���á�.����ʾ�����磺

AAA.BBB

������Ҫ���е�A���Ӻ�B���ӽ���λ�á�
�ƶ����ӵĹ����ǣ�
1. A����ֻ�����ұ��ƶ���B����ֻ��������ƶ���
2. ÿ�����ӿ����ƶ������ڵĿ�λ��
3. ÿ�����ӿ������������һ�����������λ��A����B����B����A����

AAA.BBB �����߷���
�ƶ�A ==> AA.ABBB
�ƶ�B ==> AAAB.BB

���ߵ����ӣ�
AA.ABBB ==> AABA.BB

���µĳ��������AB��λ�Ĺ��ܣ�����ϸ�Ķ�����Դ�룬��д���߲���ȱʧ�����ݡ�



public class Main
{
	static void move(char[] data, int from, int to)
	{
		data[to] = data[from];
		data[from] = '.';
	}
	
	static boolean valid(char[] data, int k)
	{
		if(k<0 || k>=data.length) return false;
		return true;
	}
	
	static void f(char[] data)
	{
		while(true){
			boolean tag = false;
			for(int i=0; i<data.length; i++){
				int dd = 0; // �ƶ�����
				if(data[i]=='.') continue;
				if(data[i]=='A') dd = 1;
				if(data[i]=='B') dd = -1;
				
				if(valid(data, i+dd) && valid(data,i+dd+dd) 
				&& data[i+dd]!=data[i] && data[i+dd+dd]=='.'){ 
				// �������...
					move(data, i, i+dd+dd);
					System.out.println(new String(data));
					tag = true;
					break;
				}
			}
			
			if(tag) continue;
			
			for(int i=0; i<data.length; i++){
				int dd = 0; // `�ƶ�����
				if(data[i]=='.') continue;
				if(data[i]=='A') dd = 1;
				if(data[i]=='B') dd = -1;			
					 
				if(valid(data, i+dd) && data[i+dd]=='.'){ 
				// ������ƶ�...
					if( _____________________ ) continue;  //���λ��
					move(data, i, i+dd);
					System.out.println(new String(data));
					tag = true;
					break;
				}
			}
			
			if(tag==false) break;					
		}
	}
	
	public static void main(String[] args)
	{
		char[] data = "AAA.BBB".toCharArray();	
		f(data);
	}
}

 * @author DELL
 *
 */
public class A3_���ӻ�λ {
	static void move(char[] data, int from, int to)
	{
		data[to] = data[from];
		data[from] = '.';
	}
	
	static boolean valid(char[] data, int k)    //�жϱ߽�
	{
		if(k<0 || k>=data.length) return false;
		return true;
	}
	
	static void f(char[] data)
	{
		while(true){
			boolean tag = false;
			for(int i=0; i<data.length; i++){
				int dd = 0; // �ƶ�����
				if(data[i]=='.') continue;
				if(data[i]=='A') dd = 1;
				if(data[i]=='B') dd = -1;
				
				if(valid(data, i+dd) && valid(data,i+dd+dd) 
				&& data[i+dd]!=data[i] && data[i+dd+dd]=='.'){ 
				// �������...
					move(data, i, i+dd+dd);
					System.out.println(new String(data));
					tag = true;
					break;
				}
			}
			
			if(tag) continue;
			
			System.out.println();
			for(int i=0; i<data.length; i++){
				int dd = 0; // `�ƶ�����
				if(data[i]=='.') continue;
				if(data[i]=='A') dd = 1;
				if(data[i]=='B') dd = -1;			
					 
				if(valid(data, i+dd) && data[i+dd]=='.'){ 
				// ������ƶ�...
//					if(valid(data,i+dd+dd) && (valid(data,i+dd*-1) && data[i+dd+dd]==data[i+dd*-1])) continue;  //���λ��
					move(data, i, i+dd);
					System.out.println(new String(data));
					tag = true;
					break;
				}
			}
			
			if(tag==false) break;					
		}
	}
	
	public static void main(String[] args)
	{
		char[] data = "AAA.BBB".toCharArray();	
		f(data);
	}
}
