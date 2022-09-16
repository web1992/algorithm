package cn.web1992.algorithm.leetcode;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/x21ib6/}
 */
public class 只出现一次的数字 {

    public static void main(String[] args) {

        int[] arr = new int[]{4, 1, 2, 1, 2};
        int ans = new Solution().singleNumber(arr);
        System.out.println(ans);
    }

    static class Solution {
        public int singleNumber(int[] nums) {

            int t = nums[0];
            for (int i = 1; i < nums.length; i++) {
                t = t ^ nums[i];
            }
            return t;
        }
    }
}
