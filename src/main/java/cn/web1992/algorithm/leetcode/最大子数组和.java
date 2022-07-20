package cn.web1992.algorithm.leetcode;

/**
 * @link {https://leetcode.cn/problems/maximum-subarray/}
 */
public class 最大子数组和 {
    public static void main(String[] args) {

        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = new Solution().maxSubArray(arr);
        System.out.println(ans);
    }

    static class Solution {

        /**
         * 动态规划
         *
         * @param nums
         * @return
         */
        public int maxSubArray(int[] nums) {

            int ans = nums[0];

            int len = nums.length;
            int[] dp = new int[len];
            dp[0] = nums[0];

            for (int i = 1; i < len; i++) {
                dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            }

            for (int i = 0; i < len; i++) {
                ans = Math.max(ans, dp[i]);
            }

            return ans;
        }
    }
}
