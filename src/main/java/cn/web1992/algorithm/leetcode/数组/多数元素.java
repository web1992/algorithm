package cn.web1992.algorithm.leetcode.数组;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xm77tm/}
 */
public class 多数元素 {

    class Solution {
        public int majorityElement(int[] nums) {

            int count = 1;
            int mark = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (count == 0) {
                    count = 1;
                    mark = nums[i];
                } else if (mark != nums[i]) {
                    count--;
                } else {
                    count++;
                }
            }

            return mark;
        }
    }

}
