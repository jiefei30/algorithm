package interview.ebay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Wangmingcan
 * @date 2021/11/23 15:45
 * @description
 */
public class A {

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,2,5};
        System.out.println(test1(nums));
        System.out.println(test2(nums));
    }
    
    static public Long test1(int[] nums) {
        Long res = 0L;
        List<Integer[]> list = new ArrayList();
        for (int x = 0; x < nums.length; x++) {
            for (int y = 0; y < nums.length; y++) {
                list.add(new Integer[]{nums[x], nums[y]});
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                Integer[] arr1 = list.get(i);
                Integer[] arr2 = list.get(j);
                int cur = Math.abs(arr1[0]-arr2[0])*Math.abs(arr1[1]-arr2[1]);
                res = Math.max(res, cur);
            }
        }
        return res;
    }

    static public Long test2(int[] nums) {
        if (nums.length < 4) {
            return 0L;
        }
        Arrays.sort(nums);
        int x1 = nums[0]; //1
        int y1 = nums[1]; //2

        int x2 = nums[1];
        int y2 = nums[0];

        int x3 = nums[nums.length-1]; //3
        int y3 = nums[nums.length-2]; //5

        int x4 = nums[nums.length-2]; //3
        int y4 = nums[nums.length-1]; //5
        return Long.valueOf(Math.abs((y1-y2)*(x1-x2)));
    }
}
