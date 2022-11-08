package cn.web1992.algorithm.leetcode.数组;

import java.util.Arrays;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2ba4i/}
 */
public class 移动零 {

    public static void main(String[] args) {

        int[] arr = new int[]{0, 1, 0, 3, 12};
        new Solution().moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    static class Solution {

        // 填充0
        // [0,1,0,3,12] -> [1,3,12,0,0]
        public void moveZeroes(int[] nums) {

            int left = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[left++] = nums[i];
                }
            }
            for (int j = left; j < nums.length; j++) {
                nums[j] = 0;
            }

        }
    }
}
