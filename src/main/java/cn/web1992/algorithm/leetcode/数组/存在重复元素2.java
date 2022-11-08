package cn.web1992.algorithm.leetcode.数组;

import java.util.Arrays;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xm1rfd/}
 */
public class 存在重复元素2 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 1};
        boolean ans = new Solution().containsDuplicate(arr);
        System.out.println(ans);
    }

    static class Solution {
        public boolean containsDuplicate(int[] nums) {

            int len = nums.length;

            if (len == 1) {
                return false;
            }

            Arrays.sort(nums);

            for (int i = 1; i < len; i++) {
                if (nums[i] == nums[i - 1]) {
                    return true;
                }
            }

            return false;

        }
    }
}
