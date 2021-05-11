package lanqiao_GBK.a3第八届国赛

�ڰ˽����;

/**
 * ģ������ͼ���������������ָ����ܰ�����ָ����

1. ���֣�'NUM X'��XΪһ��ֻ������д��ĸ�����ֵ��ַ�������ʾһ����ǰ���Ƶ���
2. ����ָ�'ADD','SUB','MUL','DIV','MOD'���ֱ��ʾ�Ӽ��ˣ�����ȡ�̣�����ȡ��
3. ����ת��ָ�'CHANGE K'������ǰ����ת��ΪK����(2��K��36)
4. ���ָ�'EQUAL'���Ե�ǰ����������
5. ����ָ�'CLEAR'�������ǰ����

ָ������¹��������
���֣�����ָ�����������������ת��ָ����ָ�����ָ���п�����������
����ָ�����ֵĵ�һ�����֣���ʾ������������֡����ڸ�����ָ��͸������м䲻���������ָ������ָ��
����ָ�����ֵĵ�һ�����֣���ʾ����ֵ����������ָ��͵�һ�������м䲻���������ָ������ָ��
����ת��ָ����ܳ������κεط�

����������м������Ϊ�Ǹ���������С��2^63��
�Դ�д��'A'~'Z'��ʾ10~35

[�����ʽ]
��1�У�1��n����ʾָ������
��2..n+1�У�ÿ�и���һ��ָ�ָ������һ����'CLEAR'��Ϊ��ʼ����������ָ�����

[�����ʽ]
���θ���ÿһ��'EQUAL'�õ��Ľ��

[��������]
7
CLEAR
NUM 1024
CHANGE 2
ADD
NUM 100000
CHANGE 8
EQUAL

[�������]
2040

����˵����
1. n ֵ��Χ: 1<= n < 50000
2. ��ʼĬ�ϵĽ�����ʮ����



��ԴԼ����
��ֵ�ڴ����� < 256M
CPU����  < 1000ms

 * @author DELL
 *
 */
public class B4_С������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine().trim());
		System.out.println(n);
		String[] program = new String[n];
		for(int i=0;i<n;i++) 	program[i] = sc.nextLine();
		program[n]="EQUAL";
		int base=0,jinzhi=10;
		String cur,symbol  = "";

		for(int i=0;i<n+1;i++) {
			cur = program[i].trim();
			switch(cur) {
			case "CLEAR":base=0;break;
			case "EQUAL":System.out.println(Integer.toString(base,jinzhi));break;
			case "ADD":symbol = "ADD";break;
			case "SUB":symbol = "SUB";break;
			case "MUL":symbol = "MUL";break;
			case "DIV":symbol = "DIV";break;
			case "MOD":symbol = "MOD";break;
			}
			if(cur.contains("CHANGE")) jinzhi = Integer.parseInt(getInt(cur));
			else if(cur.contains("NUM")) {
				if(symbol.length()==0) base = Integer.valueOf(getInt(cur), jinzhi);
				else {
					switch(symbol) {
					case "ADD":base+=Integer.valueOf(getInt(cur), jinzhi);break;
					case "SUB":base-=Integer.valueOf(getInt(cur), jinzhi);break;
					case "MUL":base*=Integer.valueOf(getInt(cur), jinzhi);break;
					case "DIV":base/=Integer.valueOf(getInt(cur), jinzhi);break;
					case "MOD":base%=Integer.valueOf(getInt(cur), jinzhi);break;
					}
				}
				
			}
		}
	}
	public static String getInt(String str) {
		return str.substring(str.indexOf(" ")+1);
	}
}
