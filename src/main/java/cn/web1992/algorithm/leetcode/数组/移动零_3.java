package cn.web1992.algorithm.leetcode.数组;

import java.util.Arrays;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xmy9jh/}
 */
public class 移动零_3 {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 3, 12};
        new Solution().moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    static class Solution {

        /**
         * 输入: nums = [0,1,0,3,12]
         * 输出: [1,3,12,0,0]
         *
         * @param nums
         */
        public void moveZeroes(int[] nums) {

            if (nums.length == 1) {
                return;
            }

            int left = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[left++] = nums[i];
                }
            }

            for (int i = left; i < nums.length; ) {
                nums[i++] = 0;
            }

        }


    }
}
