package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/10 14:51
 * @description 用 Rand7() 实现 Rand10()
 */
public class A470 {
    public static void main(String[] args) {
        System.out.println((int)(7/2));
    }

    class SolBase {
        public int rand7() {
            return (int) (Math.random()*7+1);
        }
    }

    class Solution extends SolBase {
        public int rand10() {
            int first,second;
            while ((first = rand7()) > 2);
            while ((second = rand7()) > 5);
            return first%2 == 0 ? second : second+5;
        }
    }
}
