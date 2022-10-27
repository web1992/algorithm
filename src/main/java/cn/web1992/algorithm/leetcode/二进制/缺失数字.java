package cn.web1992.algorithm.leetcode.二进制;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnj4mt/}
 */
public class 缺失数字 {

    class Solution {
        public int missingNumber(int[] nums) {

            int len = nums.length;
            int num = nums[0];
            for (int i = 1; i < len; i++) {
                num = nums[i] ^ i + 1;
            }
            return num;
        }
    }

}
