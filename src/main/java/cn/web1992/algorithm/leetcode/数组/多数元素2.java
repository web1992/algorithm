package cn.web1992.algorithm.leetcode.数组;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xm77tm/}
 */
public class 多数元素2 {

    class Solution {

        public int majorityElement(int[] nums) {

            int n = nums[0];
            int count = 1;
            for (int i = 1; i < nums.length; i++) {
                if (count == 0) {
                    count = 1;
                    n = nums[i];
                } else if (nums[i] != n) {
                    count--;
                } else {
                    count++;
                }
            }
            return n;
        }
    }

}
