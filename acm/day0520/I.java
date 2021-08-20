package acm.day0520;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Wangmingcan
 * @date 2021/5/20 20:28
 * @description
 */
public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.next());
        BigInteger x = new BigInteger(sc.next());
        BigInteger y = new BigInteger(sc.next());
        BigInteger one = new BigInteger("1");
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");
        BigInteger res;
        if (x.add(y).subtract(n).longValue() < 0 ) {
            res = (x.multiply(x)
                    .add(x.multiply(three))
                    .add(y.multiply(y))
                    .add(two.multiply(x).multiply(y))
                    .add(y)).divide(two);
        }else {
            BigInteger i = n.subtract(x).subtract(one);
            BigInteger j = n.subtract(y).subtract(one);
            res = n.multiply(n)
                    .subtract(one)
                    .subtract((i.multiply(i).add(three.multiply(i))).divide(two))
                    .subtract((j.multiply(j).add(two.multiply(i).multiply(j).add(j))).divide(two));
        }
        System.out.println(res.toString());
    }
}
