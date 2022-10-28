package cn.web1992.algorithm.leetcode.test;

public class 只出现一次的数字Test01 {

    class Solution {
        public int singleNumber(int[] nums) {

            if (nums.length == 1) {
                return nums[0];
            }

            int num = nums[0];
            for (int i = 1; i < nums.length; i++) {
                num ^= nums[i];
            }
            return num;

        }
    }
}
