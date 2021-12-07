package codetop;

/**
 * @author Wangmingcan
 * @date 2021/12/7 9:43
 * @description 只出现一次的数字
 *
 * 异或
 */
public class A136 {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
