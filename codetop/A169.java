package codetop;

/**
 * @author Wangmingcan
 * @date 2021/11/19 20:58
 * @description 多数元素
 * Boyer-Moore 投票算法
 * 算法过程：
 * 我们维护一个候选众数 candidate 和它出现的次数 count。初始时 candidate 可以为任意值，count 为 0；
 * 我们遍历数组 nums 中的所有元素，对于每个元素 x，在判断 x 之前，如果 count 的值为 0，我们先将 x 的值赋予 candidate，随后我们判断 x：
 * 1. 如果 x 与 candidate 相等，那么计数器 count 的值增加 1；
 * 2. 如果 x 与 candidate 不等，那么计数器 count 的值减少 1。
 * 在遍历完成后，candidate 即为整个数组的众数。
 *
 * 投票算法证明：
 * 1. 如果候选人不是maj 则 maj,会和其他非候选人一起反对 会反对候选人,所以候选人一定会下台(maj==0时发生换届选举)
 * 2. 如果候选人是maj , 则maj 会支持自己，其他候选人会反对，同样因为maj 票数超过一半，所以maj 一定会成功当选
 */
public class A169 {
    public static void main(String[] args) {

    }

    class Solution {
        public int majorityElement(int[] nums) {
            int cand = 0, count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (count == 0) {
                    cand = nums[i];
                }
                count += (cand == nums[i] ? 1 : -1);
            }
            return cand;
        }
    }
}
