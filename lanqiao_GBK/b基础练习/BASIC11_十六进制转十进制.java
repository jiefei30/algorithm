package lanqiao_GBK.b基础练习

������ϰ;

/**
 * ��������
�����Ӽ�������һ��������8λ������ʮ���������ַ���������ת��Ϊ����ʮ�������������
����ע��ʮ���������е�10~15�ֱ��ô�д��Ӣ����ĸA��B��C��D��E��F��ʾ��
��������
FFFF
�������
65535
 * @author DELL
 *
 */
public class BASIC11_ʮ������תʮ���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sixteen = sc.next();
		long ten = 0;
		for(int i=0;i<sixteen.length();i++) {
			switch(sixteen.charAt(i)) {
			case '0':ten+=0;break;
			case '1':ten+=1*Math.pow(16, (sixteen.length()-1-i));break;
			case '2':ten+=2*Math.pow(16, (sixteen.length()-1-i));break;
			case '3':ten+=3*Math.pow(16, (sixteen.length()-1-i));break;
			case '4':ten+=4*Math.pow(16, (sixteen.length()-1-i));break;
			case '5':ten+=5*Math.pow(16, (sixteen.length()-1-i));break;
			case '6':ten+=6*Math.pow(16, (sixteen.length()-1-i));break;
			case '7':ten+=7*Math.pow(16, (sixteen.length()-1-i));break;
			case '8':ten+=8*Math.pow(16, (sixteen.length()-1-i));break;
			case '9':ten+=9*Math.pow(16, (sixteen.length()-1-i));break;
			case 'A':ten+=10*Math.pow(16, (sixteen.length()-1-i));break;
			case 'B':ten+=11*Math.pow(16, (sixteen.length()-1-i));break;
			case 'C':ten+=12*Math.pow(16, (sixteen.length()-1-i));break;
			case 'D':ten+=13*Math.pow(16, (sixteen.length()-1-i));break;
			case 'E':ten+=14*Math.pow(16, (sixteen.length()-1-i));break;
			case 'F':ten+=15*Math.pow(16, (sixteen.length()-1-i));break;
			}
		}
		System.out.println(ten);
	}
}
