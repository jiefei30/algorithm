package lanqiao_GBK.a3第八届国赛

�ڰ˽����;

/**
 * С����ʵ������N̨���ԣ����1~N��ԭ����N̨����֮����N-1����������������ǡ�ù���һ���������硣�����������ϣ�������̨����֮����Ψһ��·��������

���������һ��ά������ʱ������Ա�����ʹ��ĳ��̨����֮��������һ���������ӣ����������г����˻�·����·�ϵĵ�����������֮�䲻����ֻ��һ��·����ʹ����Щ�����ϵ����ݴ��������BUG��

Ϊ�˻ָ��������䡣С����Ҫ�ҵ������ڻ�·�ϵĵ��ԣ����ܰ�������

����
-----
��һ�а���һ������N��
����N��ÿ����������a��b����ʾa��b֮����һ����������������

����30%�����ݣ�1 <= N <= 1000
����100%������, 1 <= N <= 100000�� 1 <= a, b <= N

���뱣֤�Ϸ���

���
----
����С�����˳������ڻ�·�ϵĵ��Եı�ţ��м���һ���ո�ָ���


�������룺
5
1 2
3 1
2 4
2 5
5 3

���������
1 2 3 5
 * @author DELL
 *
 */
public class A4_���ֻ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] graph = new int[N][2];
		int a,b,c=0;
		HashSet<Integer> hset = new HashSet<Integer>();
		for(int i=0;i<N;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a>b) {
				graph[i][0] = b;
				graph[i][1] = a;
			}else {
				graph[i][0] = a;
				graph[i][1] = b;
			}
			hset.add(graph[i][1]);
			if(hset.size()!=i+1) c = graph[i][1];
		}
		ArrayList<Integer> path = new ArrayList<Integer>();
		int p1=0,p2=0,c1,c2;
		for(int i=0,j=0;i<N;i++) {
			if(graph[i][1]==c) {
				if(j==0) {
					p1=graph[i][0];
					graph[i][1] = 0;
					j++;
				}else {
					p2 = graph[i][0];
					graph[i][1]=0;
					break;
				}
			}
		}
		path.add(c);
		path.add(p1);
		path.add(p2);
		while(p1!=p2) {
			c1=p1;
			c2=p2;
			for(int i=0,j=0;i<N&&j<2;i++) {
				if(graph[i][1]==0) continue;
				else {
					if(graph[i][1]==c1) {
						p1 = graph[i][0];
						j++;
					}else if(graph[i][1]==c2) {
						p2 = graph[i][0];
						j++;
					}
				}
				graph[i][1]=0;
			}
			path.add(p1);
			path.add(p2);
		}
		path.remove(path.size()-1);
		int[] res = new int[path.size()];
		for(int i=0;i<path.size();i++) {
			res[i] = path.get(i);
		}
		Arrays.sort(res);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
}
