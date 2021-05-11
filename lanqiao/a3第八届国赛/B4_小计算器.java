package lanqiao.a3第八届国赛;

import java.util.Scanner;

/**
 * 模拟程序型计算器，依次输入指令，可能包含的指令有

1. 数字：'NUM X'，X为一个只包含大写字母和数字的字符串，表示一个当前进制的数
2. 运算指令：'ADD','SUB','MUL','DIV','MOD'，分别表示加减乘，除法取商，除法取余
3. 进制转换指令：'CHANGE K'，将当前进制转换为K进制(2≤K≤36)
4. 输出指令：'EQUAL'，以当前进制输出结果
5. 重置指令：'CLEAR'，清除当前数字

指令按照以下规则给出：
数字，运算指令不会连续给出，进制转换指令，输出指令，重置指令有可能连续给出
运算指令后出现的第一个数字，表示参与运算的数字。且在该运算指令和该数字中间不会出现运算指令和输出指令
重置指令后出现的第一个数字，表示基础值。且在重置指令和第一个数字中间不会出现运算指令和输出指令
进制转换指令可能出现在任何地方

运算过程中中间变量均为非负整数，且小于2^63。
以大写的'A'~'Z'表示10~35

[输入格式]
第1行：1个n，表示指令数量
第2..n+1行：每行给出一条指令。指令序列一定以'CLEAR'作为开始，并且满足指令规则

[输出格式]
依次给出每一次'EQUAL'得到的结果

[样例输入]
7
CLEAR
NUM 1024
CHANGE 2
ADD
NUM 100000
CHANGE 8
EQUAL

[样例输出]
2040

补充说明：
1. n 值范围: 1<= n < 50000
2. 初始默认的进制是十进制



资源约定：
峰值内存消耗 < 256M
CPU消耗  < 1000ms

 * @author DELL
 *
 */
public class B4_小计算器 {
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
