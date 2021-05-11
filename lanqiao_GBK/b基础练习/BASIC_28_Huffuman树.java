package lanqiao_GBK.b基础练习

������ϰ;
/**
 * Huffuman��  
 */

public class BASIC_28_Huffuman�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a,b,t,total=0;
		ArrayList<Integer> p = new ArrayList<Integer>(); 
		for(int i=0;i<n;i++) {
			p.add(sc.nextInt());
		}
		while(p.size()>1) {
			p = paixu(p);
			a=p.get(0);
			b=p.get(1);
			total = total +a+b;
			p.remove(0);
			p.remove(0);
			p.add(a+b);
		}
		System.out.println(total);
	}
	public static ArrayList<Integer> paixu(ArrayList<Integer> p) {
		int t;
		for(int i=0;i<p.size()-1;i++) {
			for(int j=0;j<p.size()-1-i;j++) {
				if(p.get(j)>p.get(j+1)) {
					t = p.get(j);
					p.set(j, p.get(j+1));
					p.set(j+1, t);
				}
			}
		}
		return p;
	}
}
