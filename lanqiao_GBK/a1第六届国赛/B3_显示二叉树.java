package lanqiao_GBK.a1第六届国赛���������;
/**
 * ���⣺��ʾ������

����������������ǣ�
ĳ���ڵ�������������нڵ�ֵ�������ڱ��ڵ�ֵ��
ĳ���ڵ�������������нڵ�ֵ����С�ڱ��ڵ�ֵ��

Ϊ��������ع۲�������Ľ������̣�С��д��һ�γ�������ʾ���������Ľṹ����


class BiTree
{
	private int v;
	private BiTree l;
	private BiTree r;
	
	public BiTree(int v){
		this.v = v;
	}
	
	public void add(BiTree the){
		if(the.v < v){
			if(l==null) l = the;
			else l.add(the);
		}
		else{
			if(r==null) r = the;
			else r.add(the);
		}
	}
	
	public int getHeight(){
		int h = 2;
		int hl = l==null? 0 : l.getHeight();
		int hr = r==null? 0 : r.getHeight();
		return h + Math.max(hl,hr);
	}
	
	public int getWidth(){
		int w = (""+v).length();
		if(l!=null) w += l.getWidth();
		if(r!=null) w += r.getWidth();
		return w;
	}
	
	public void show(){
		char[][] buf = new char[getHeight()][getWidth()];
		printInBuf(buf, 0, 0);
		showBuf(buf);
	}
	
	private void showBuf(char[][] x){
		for(int i=0; i<x.length; i++){
			for(int j=0; j<x[i].length; j++)
				System.out.print(x[i][j]==0? ' ':x[i][j]);
			System.out.println();
		}
	}
	
	private void printInBuf(char[][] buf, int x, int y){
		String sv = "" + v;
		
		int p1 = l==null? x : l.getRootPos(x);
		int p2 = getRootPos(x);
		int p3 = r==null? p2 : r.getRootPos(p2+sv.length());
		
		buf[y][p2] = '|';
		for(int i=p1; i<=p3; i++) buf[y+1][i]='-';
		for(int i=0; i<sv.length(); i++) ________________________________;  //���λ��
		if(p1<p2) buf[y+1][p1] = '/';
		if(p3>p2) buf[y+1][p3] = '\\';
		
		if(l!=null) l.printInBuf(buf,x,y+2);
		if(r!=null) r.printInBuf(buf,p2+sv.length(),y+2);
	}
	
	private int getRootPos(int x){
		return l==null? x : x + l.getWidth();
	}
}

public class Main
{
	public static void main(String[] args)
	{		
		BiTree tree = new BiTree(500);
		tree.add(new BiTree(200));
		tree.add(new BiTree(509));
		tree.add(new BiTree(100));
		tree.add(new BiTree(250));
		tree.add(new BiTree(507));
		tree.add(new BiTree(600));
		tree.add(new BiTree(650));
		tree.add(new BiTree(450));
		tree.add(new BiTree(510));
		tree.add(new BiTree(440));
		tree.add(new BiTree(220));		
		tree.show();		
	}
}

�����ϱߵĲ������ݣ�Ӧ����ʾ����
                  |
   /--------------500---\
   |                    |
/--200---\           /--509---\
|        |           |        |
100   /--250---\     507   /--600\
      |        |           |     |
      220   /--450         510   650
            |
            440

 * @author DELL
 *
 */
public class B3_��ʾ������ {
	public static void main(String[] args)
	{		
		BiTree tree = new BiTree(500);
		tree.add(new BiTree(200));
		tree.add(new BiTree(509));
		tree.add(new BiTree(100));
		tree.add(new BiTree(250));
		tree.add(new BiTree(507));
		tree.add(new BiTree(600));
		tree.add(new BiTree(650));
		tree.add(new BiTree(450));
		tree.add(new BiTree(510));
		tree.add(new BiTree(440));
		tree.add(new BiTree(220));		
		tree.show();		
	}
}
class BiTree
{
	private int v;
	private BiTree l;
	private BiTree r;
	
	public BiTree(int v){
		this.v = v;
	}
	
	public void add(BiTree the){
		if(the.v < v){
			if(l==null) l = the;
			else l.add(the);
		}
		else{
			if(r==null) r = the;
			else r.add(the);
		}
	}
	
	public int getHeight(){
		int h = 2;
		int hl = l==null? 0 : l.getHeight();
		int hr = r==null? 0 : r.getHeight();
		return h + Math.max(hl,hr);
	}
	
	public int getWidth(){
		int w = (""+v).length();
		if(l!=null) w += l.getWidth();
		if(r!=null) w += r.getWidth();
		return w;
	}
	
	public void show(){
		char[][] buf = new char[getHeight()][getWidth()];
		printInBuf(buf, 0, 0);
		showBuf(buf);
	}
	
	private void showBuf(char[][] x){
		for(int i=0; i<x.length; i++){
			for(int j=0; j<x[i].length; j++)
				System.out.print(x[i][j]==0? ' ':x[i][j]);
			System.out.println();
		}
	}
	
	private void printInBuf(char[][] buf, int x, int y){
		String sv = "" + v;
		
		int p1 = l==null? x : l.getRootPos(x);
		int p2 = getRootPos(x);
		int p3 = r==null? p2 : r.getRootPos(p2+sv.length());
		
		buf[y][p2] = '|';
		for(int i=p1; i<=p3; i++) buf[y+1][i]='-';
		for(int i=0; i<sv.length(); i++) buf[y+1][p2+i]=sv.charAt(i);  
		if(p1<p2) buf[y+1][p1] = '/';
		if(p3>p2) buf[y+1][p3] = '\\';
		
		if(l!=null) l.printInBuf(buf,x,y+2);
		if(r!=null) r.printInBuf(buf,p2+sv.length(),y+2);
	}
	
	private int getRootPos(int x){
		return l==null? x : x + l.getWidth();
	}
}