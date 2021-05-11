package lanqiao.a2第七届国赛;
/**
 * X星球愤怒的小鸟喜欢撞火车！

一根平直的铁轨上两火车间相距 1000 米
两火车 （不妨称A和B） 以时速 10米/秒 相对行驶。

愤怒的小鸟从A车出发，时速50米/秒，撞向B车，
然后返回去撞A车，再返回去撞B车，如此往复....
两火车在相距1米处停车。

问：这期间愤怒的小鸟撞 B 车多少次？

 * @author DELL
 *
 */
public class B1_愤怒小鸟 {
	public static void main(String[] args) {
		 int count=0;
		 double s = 1000;
		 while(s>1) {
			 System.out.println(s);
			 s = s-(s/60)*20;
			 count++;
		 }
		   
		 System.out.println(count);
	}
}
