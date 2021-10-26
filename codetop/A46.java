package codetop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Wangmingcan
 * @date 2021/10/26 13:36
 * @description
 */
public class A46 {
    public static void main(String[] args) {

    }

    class Solution {

        private List<List<Integer>> list = new ArrayList<>();

        public List<List<Integer>> permute(int[] nums) {
            dfs(nums, 0, nums.length-1);
            return list;
        }

        public void dfs(int[] array,int start,int end) {
            if(start==end) {
                List<Integer> li = new ArrayList<>();
                for (int i = 0; i < array.length; i++) {
                    li.add(array[i]);
                }
                list.add(li);
            } else {
                for (int i = start; i <= end; i++) {
                    swap(array,start,i);
                    dfs(array,start+1,end);
                    swap(array,start,i);
                }
            }
        }

        public void swap(int[] array,int i,int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
