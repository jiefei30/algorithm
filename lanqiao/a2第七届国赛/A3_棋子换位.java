package lanqiao.a2第七届国赛;
/**
 * 有n个棋子A，n个棋子B，在棋盘上排成一行。
它们中间隔着一个空位，用“.”表示，比如：

AAA.BBB

现在需要所有的A棋子和B棋子交换位置。
移动棋子的规则是：
1. A棋子只能往右边移动，B棋子只能往左边移动。
2. 每个棋子可以移动到相邻的空位。
3. 每个棋子可以跳过相异的一个棋子落入空位（A跳过B或者B跳过A）。

AAA.BBB 可以走法：
移动A ==> AA.ABBB
移动B ==> AAAB.BB

跳走的例子：
AA.ABBB ==> AABA.BB

以下的程序完成了AB换位的功能，请仔细阅读分析源码，填写划线部分缺失的内容。



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
				int dd = 0; // 移动方向
				if(data[i]=='.') continue;
				if(data[i]=='A') dd = 1;
				if(data[i]=='B') dd = -1;
				
				if(valid(data, i+dd) && valid(data,i+dd+dd) 
				&& data[i+dd]!=data[i] && data[i+dd+dd]=='.'){ 
				// 如果能跳...
					move(data, i, i+dd+dd);
					System.out.println(new String(data));
					tag = true;
					break;
				}
			}
			
			if(tag) continue;
			
			for(int i=0; i<data.length; i++){
				int dd = 0; // `移动方向
				if(data[i]=='.') continue;
				if(data[i]=='A') dd = 1;
				if(data[i]=='B') dd = -1;			
					 
				if(valid(data, i+dd) && data[i+dd]=='.'){ 
				// 如果能移动...
					if( _____________________ ) continue;  //填空位置
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
public class A3_棋子换位 {
	static void move(char[] data, int from, int to)
	{
		data[to] = data[from];
		data[from] = '.';
	}
	
	static boolean valid(char[] data, int k)    //判断边界
	{
		if(k<0 || k>=data.length) return false;
		return true;
	}
	
	static void f(char[] data)
	{
		while(true){
			boolean tag = false;
			for(int i=0; i<data.length; i++){
				int dd = 0; // 移动方向
				if(data[i]=='.') continue;
				if(data[i]=='A') dd = 1;
				if(data[i]=='B') dd = -1;
				
				if(valid(data, i+dd) && valid(data,i+dd+dd) 
				&& data[i+dd]!=data[i] && data[i+dd+dd]=='.'){ 
				// 如果能跳...
					move(data, i, i+dd+dd);
					System.out.println(new String(data));
					tag = true;
					break;
				}
			}
			
			if(tag) continue;
			
			System.out.println();
			for(int i=0; i<data.length; i++){
				int dd = 0; // `移动方向
				if(data[i]=='.') continue;
				if(data[i]=='A') dd = 1;
				if(data[i]=='B') dd = -1;			
					 
				if(valid(data, i+dd) && data[i+dd]=='.'){ 
				// 如果能移动...
//					if(valid(data,i+dd+dd) && (valid(data,i+dd*-1) && data[i+dd+dd]==data[i+dd*-1])) continue;  //填空位置
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
